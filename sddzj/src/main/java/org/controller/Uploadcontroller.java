package org.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.log.Log4jForProjectLogger;
import org.log.ToDBLogBean;
import org.model.EvtFile;
import org.pojo.MdTasktable;
import org.pojo.TLog;
import org.service.ILogService;
import org.service.ITaskTableService;
import org.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.tools.EvtFileUtils;


@Controller
@RequestMapping("/upload")
public class Uploadcontroller{
	
	private Log4jForProjectLogger logger = new Log4jForProjectLogger(Uploadcontroller.class);
	@Autowired ITaskTableService tasktableService;
	@Autowired ILogService logService;
	boolean  bNowDoing = false;
	static ArrayList  filesRun    =   new   ArrayList(); 
    int iCurDo = -1;
	static int   iMaxFileThread = 0;
	static boolean bMonitorStart = false;
	static boolean bMonitorCanStart = false;
	int iMaxThread=  1;
	String path;
	@RequestMapping("/bigfile")
	public String uploadBigFile(HttpServletRequest request,@RequestParam(value = "file", required = false) MultipartFile file, ModelMap model) throws IOException{
		//System.out.println(request.getRemoteAddr()+":"+file.getOriginalFilename()+"开始上传");
	    path=request.getParameter("path");
	    TLog t = new TLog();
		t.setEvent("上传EVT文件");
		t.setLogCreater(request.getSession().getAttribute("username").toString());
		t.setLogTime(new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss").format(new Date()));
		t.setLogtype("上传");
		t.setTablename("file");
		String filename = file.getOriginalFilename();
		String realPath = request.getSession().getServletContext().getRealPath("upload");
		String filePath = realPath +"/"+ filename;
		 System.out.println("------ " + filePath );
		String uuid=UUID.randomUUID().toString();
		final EvtFile evtFile = new EvtFile(uuid, filename, filePath, null);
		File uploadfile = new File(filePath);
		if(!uploadfile.getParentFile().exists())
		{
			uploadfile.getParentFile().mkdirs();
		}
		try 
		{
			file.transferTo(uploadfile);
			t.setRemark("上传成功");
		} catch (Exception e) 
		{
			t.setRemark("上传失败");
			e.printStackTrace();
		}
		logService.add(t);
		//System.out.println(request.getRemoteAddr()+":"+file.getOriginalFilename()+"上传完成...");
		/*Thread thread1 = new Thread(new Runnable() 
		{
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
					String start = df.format(new Date());
					EvtFileUtils.partEvtFile(evtFile);
					SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
					String end = df1.format(new Date());
					System.out.println("------" + start + "    " + end );
					 
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		thread1.setPriority(10);
		thread1.start();
		
		*/
		filesRun.add(evtFile);
        if(iMaxFileThread < iMaxThread && !bMonitorStart)
        {
        	for(int i=0;i<filesRun.size();i++)
        	{
        		 if(iMaxFileThread >=iMaxThread)
        		 {
        			 break;
        		 } 
        		 EvtFile nowFile = ((EvtFile)filesRun.get(i));
        		 if(nowFile.getFileDo())
        		 {
        			 continue;
        		 }
        		 iMaxFileThread++;
        		 MyFileEVTThread th = new MyFileEVTThread("",i,path);
        		 th.setPriority(10);
     			 th.start();
        		 
        		 /*
        		 
        		 iCurDo = i;
        		 Thread thread = new Thread(new Runnable() 
        			{
        				@Override
        				public void run() {
        					// TODO Auto-generated method stub
        					try {
        						
        						EvtFile nowFile = ((EvtFile)filesRun.get(iCurDo));
        						if(nowFile.getFileDo())
        							return ;
        						iMaxFileThread++;
        						nowFile.setFileDo(true);
        						//System.out.println("------1");
        						System.out.println("------2" + "    " + nowFile.getFileName() + "   " + nowFile.getFileDo() + "  " + iCurDo);
        						SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        						String start = df.format(new Date());
        						EvtFileUtils.partEvtFile(nowFile);
        						SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        						String end = df1.format(new Date());
        						//System.out.println("------" + start + "    " + end );
        						nowFile.setFileDoFinished(true);
        						iMaxFileThread--;
        						
        					} catch (Exception e) {
        						// TODO Auto-generated catch block
        						e.printStackTrace();
        					}
        				}
        				
        			});
        			thread.setPriority(10);
        			thread.start();
        			*/
        			
        	}
        	//bMonitorCanStart=true;  
        }
        
       
        if(!bMonitorStart)
        {
        	bMonitorStart = true;
        	
        	Thread threadMonitor = new Thread(new Runnable() 
    		{
    			@Override
    			public void run() 
    			{
    				
    				// TODO Auto-generated method stub
    				boolean bRun = true;
    				while(bRun)
    				{
    					if(iMaxFileThread>=iMaxThread )
    					{
    						try 
    						{
    						
    							Thread.sleep(3000);
    					    } catch (InterruptedException e) {
    						// TODO Auto-generated catch block
    						e.printStackTrace();
    					    }
    						continue;
    					}
    					else 
    					{
    					 
    						for(int i=0;i<filesRun.size();i++)
    			        	{
    			        		 if(iMaxFileThread >=iMaxThread)
    			        		 {
    			        			 break;
    			        		 } 
    			        		 EvtFile nowFile = ((EvtFile)filesRun.get(i));
    			        		 if(nowFile.getFileDo())
    			        		 {
    			        			 continue;
    			        		 }
    			        		 iMaxFileThread++;
    			        		 MyFileEVTThread th = new MyFileEVTThread("",i,path);
    			        		 th.setPriority(10);
    			     			 th.start();
    			        		 /*
    			        		 iCurDo = i;
    			        		 Thread thread = new Thread(new Runnable() 
    			        			{
    			        				@Override
    			        				public void run() {
    			        					// TODO Auto-generated method stub
    			        					try {
    			        						
    			        						
    			        						EvtFile nowFile = ((EvtFile)filesRun.get(iCurDo));
    			        						 
    			        						if(nowFile.getFileDo())
    			        							return ;
    			        						
    			        						iMaxFileThread++;
    			        						nowFile.setFileDo(true);
    			        						System.out.println("------2" + "    " + nowFile.getFileName() + "   " + nowFile.getFileDo() + "  " + iCurDo);
    			        						SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
    			        						String start = df.format(new Date());
    			        						EvtFileUtils.partEvtFile(nowFile);
    			        						SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
    			        						String end = df1.format(new Date());
    			        						//System.out.println("------" + start + "    " + end );
    			        						nowFile.setFileDoFinished(true);
    			        						iMaxFileThread--;
    			        						
    			        					} catch (Exception e) {
    			        						// TODO Auto-generated catch block
    			        						e.printStackTrace();
    			        					}
    			        				}
    			        				
    			        			});
    			        		 thread.setPriority(10);
    			        		 thread.start();
    			        		 */
    			        	}
    						if(iMaxFileThread <1)
    						{
    							System.out.println("------clear"   );
    							filesRun.clear();
    							bRun = false;
    							bMonitorStart = false;
    						}
    					}
    					
    					try {
    						Thread.sleep(3000);
    					} catch (InterruptedException e) {
    						// TODO Auto-generated catch block
    						e.printStackTrace();
    					}
    					
    				}
    			}
    			
    		});
            threadMonitor.setPriority(5);
            threadMonitor.start();
            System.out.println("------monistor start    "  );
        }
        
		
		return "welcome.jsp";
	}
	
	@RequestMapping("/download")
	public void downloadEvt(HttpServletRequest request ,HttpServletResponse response){
		String filePath = request.getParameter("filepath");
		System.out.println(filePath);
		String task_id = request.getParameter("task_id");
		response.setHeader("Content-Disposition", "attachment;filename="+(filePath.substring(filePath.length() - 18)));
		MdTasktable mtt = new MdTasktable();
		mtt.setId(Integer.parseInt(task_id));
		tasktableService.downloads(mtt);
		try(
				FileInputStream inputStream = new FileInputStream(filePath);
				ServletOutputStream outputStream = response.getOutputStream();
		){
			IOUtils.copy(inputStream, outputStream);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
class MyFileEVTThread extends Thread 
{ 
private String name; 
private int    iIndex; 
private String path; 
public MyFileEVTThread(String name,int index,String path) 
{ 
this.name = name; 
this.iIndex = index;
this.path=path;
} 
public void run() 
{ 
	try {

		EvtFile nowFile = ((EvtFile)Uploadcontroller.filesRun.get(this.iIndex));
		String path=this.path;
		if(nowFile.getFileDo())
			return ;

		nowFile.setFileDo(true);
		System.out.println("------2" + "    " + nowFile.getFileName() + "   " + nowFile.getFileDo() + "  " + iIndex+ "  " +path);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		String start = df.format(new Date());
		EvtFileUtils.partEvtFile(nowFile,path);
		SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		String end = df1.format(new Date());
		//System.out.println("------" + start + "    " + end );
		nowFile.setFileDoFinished(true);
		Uploadcontroller.iMaxFileThread--;
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
} 
 
} 

