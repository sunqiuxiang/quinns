package org.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.SequenceInputStream;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.IOUtils;
import org.dao.FileDao;
import org.log.Log4jForProjectLogger;
import org.log.ToDBLogBean;
import org.model.TWMetaInfo;
import org.pojo.MdFilepath;
import org.pojo.MdTaizhen;
import org.pojo.MdTasktable;
import org.pojo.Mdtw;
import org.pojo.Mdtz;
import org.pojo.TLog;
import org.pojo.TTask;
import org.pojo.TTaskCheck;
import org.pojo.Tztw;
import org.service.IDataService;
import org.service.IFilePathService;
import org.service.ILogService;
import org.service.ITZTWcService;
import org.service.ITaskCheckService;
import org.service.ITaskResultService;
import org.service.ITaskService;
import org.service.ITaskTableService;
import org.service.ITwService;
import org.service.ITzService;
import org.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.tools.DBUtils;
import org.tools.EvtFileUtils;
import org.tools.ZipUtils;

import com.bingh.filemanager.HDFSFile;
import com.bingh.result.Result;
import com.bingh.utils.PropsUtils;



@Controller
@RequestMapping("/data")
public class DataController {
	
	private Log4jForProjectLogger logger = new Log4jForProjectLogger(DataController.class);
	@Autowired IDataService dataService;
	@Autowired ITZTWcService tztwService;
	@Autowired ITaskService taskService;
	@Autowired ITaskCheckService taskcheckService;
	@Autowired ITaskTableService tasktableService;
	@Autowired ITwService twService;
	@Autowired ITzService tzService;
	@Autowired IFilePathService pathService;
	@Autowired IUserService userService;
	@Autowired ITaskResultService taskresultService;
	@Autowired ILogService logService;
	
	
//	@RequestMapping("/uploadjar")
//	public String uploadBigFile(@RequestParam(value = "jarfile", required = false) MultipartFile jarfile,@RequestParam(value = "textfile", required = false) MultipartFile textfile, HttpServletRequest request, ModelMap model) throws IOException{
//		ModelAndView mv = new ModelAndView();
//		String jars = "/jar";
//		String path = PropsUtils.getJarPath("jarpath");
//		String jarpath = "";
//		String jarFileName = "";
//		String textFileName = "";
//		String muban = "";
//		
//		String taizhen = request.getParameter("taizhen");
//		String monitor = request.getParameter("monitor");
//		String parameter = request.getParameter("parameter");
//		if(parameter.indexOf("E")!=-1||parameter.indexOf("e")!=-1){
//			parameter="E";
//		}
//		if(parameter.indexOf("N")!=-1||parameter.indexOf("n")!=-1){
//			parameter="N";
//		}
//		if(parameter.indexOf("U")!=-1||parameter.indexOf("u")!=-1||parameter.indexOf("Z")!=-1||parameter.indexOf("z")!=-1){
//			parameter="Z";
//		}
//		String start = request.getParameter("start");
//		String end = request.getParameter("end");
//		System.out.print("_______________________________________________________________________");
//		System.out.print("转化之前时间"+ end+start);
//		//截取字符串 yyyy-MM-dd HH:mm:ss yyyyMMddHH0000
//		String a1= start.substring(0, 4);
//		String b1=start.substring(5,7);
//		String c1=start.substring(8, 10);
//		String d1=start.substring(11, 13);
//		start=a1+b1+c1+d1+"0000";
//		
//		//截取字符串 yyyyMMddHH0000
//		//yyyy-MM-dd HH:mm:ss
//		String a2= end.substring(0, 4);
//		String b2=end.substring(5,7);
//		String c2=end.substring(8, 10);
//		String d2=end.substring(11, 13);
//		end=a2+b2+c2+d2+"0000";
//		System.out.print("时间"+ end+start);
//		// jar文件上传到BS服务器
//		if(jarfile == null || jarfile.isEmpty()){
//			System.out.println("没上传jar");
//			jarpath = "moren";
//		}else{
//			jarFileName = jarfile.getOriginalFilename();
//			//System.out.println("jar:"+jarfile.getOriginalFilename());
//			//jarFileName = "_"+new Date().getTime()+"_"+jarFileName;
//			File destFile = new File(path+jarFileName);
//			System.out.println(path+jarFileName);
//			jarfile.transferTo(destFile);
//			jarpath = destFile.getPath();
//		}
//		// text文件上传到hdfs
//		if(textfile == null || textfile.isEmpty()){
//			System.out.println("没上传text");
//		}else{
//			//textFileName = textfile.getOriginalFilename();
//			muban = PropsUtils.getMuBanPath("mubanpath");
//			textFileName = new Date().getTime()+".txt";
//			Path dstpath = new Path(muban+textFileName);
//			FileSystem fileSystem;
//			try {
//				fileSystem = FileSystem.get(URI.create(PropsUtils.getUri("uri")), new Configuration(),PropsUtils.getUser("user"));
//				System.out.println(muban);
//				FSDataOutputStream outputStream = fileSystem.create((dstpath));
//				IOUtils.copy(textfile.getInputStream(), outputStream);
//				fileSystem.close();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
//		
//		Task task = new Task();
//		task.setTaizhen(taizhen);
//		task.setMonitor(monitor);
//		task.setParameter(parameter);
//		task.setStartTime(start);
//		task.setEndTime(end);
//		task.setMuban(PropsUtils.getUri("uri").trim()+PropsUtils.getMuBanPath("mubanpath").trim()+textFileName);
//		task.setJar(jarpath);
//		task.setUserid(request.getSession().getAttribute("UserID").toString());
//		dataService.addTask(task);
//		request.setAttribute("rest", "1");
//		ToDBLogBean bean = new ToDBLogBean(new Date(), "申请计算", (String)request.getSession().getAttribute("UserName"), "");
//		logger.record(bean);
//		return "forward:compute";
//	}
//	
	@RequestMapping("/compute")
	public ModelAndView compute(HttpServletRequest request,@RequestParam(value = "uns") String uns){
		ModelAndView mv = new ModelAndView();
		List<MdTaizhen> list = new ArrayList<>();
		list = dataService.getAllTaizhen();
		System.out.println("compute:"+uns);
		mv.addObject("uns",uns);
		mv.addObject("list",list);
		mv.setViewName("compute");
		return mv;
	}
	
	@RequestMapping("/changetd")
	public @ResponseBody Map<String, Object> changetd() {
		Map<String, Object> map = new HashMap<>();
		String td="BHN,BHZ,BHE,北南向,东西向,垂直向";
		map.put("data", td);
			return map;
	}
	@RequestMapping("/shuju_list")
	public ModelAndView shuju_list(HttpServletRequest request){
		ModelAndView mv = new ModelAndView();
		List<MdTaizhen> userPower = dataService.getTaizhenPower();
		mv.addObject("powerlist", userPower);
		mv.setViewName("shuju_list");
		return mv;
	}
	
	/*
	 * 暂时写的静态值
	 */
	@RequestMapping("/fenli")
	public String fenli(Model model
			,@RequestParam(value = "taizhen") String depID
			,HttpSession session) {
		System.out.println(depID);
		try {
			
			List<Tztw> list = tztwService.getlist(Integer.parseInt(depID));
			if (list.size()>0) {
				model.addAttribute("taizhenname",list.get(0).getName());
			}
			if (Integer.parseInt(session.getAttribute("userpower").toString())>=1000) {
				model.addAttribute("Type", 3);
			}
			else if (Integer.parseInt(session.getAttribute("userpower").toString())>=500) {
				model.addAttribute("Type", 2);
			}
			else {
				model.addAttribute("Type", 1);
			}
			model.addAttribute("list", list);
			return "product_list";
		} catch (Exception e) {
			System.out.println(e);
			return "error1";
		}
	}
	@RequestMapping("/upload")
	public String upload(HttpServletRequest request
			, Model model
			,@RequestParam(value = "path") String path) {
		model.addAttribute("path", path);
		return "/upload";
	}
	
	@RequestMapping("/comput_menu_list")
	public ModelAndView computMenuList(HttpSession session){
		ModelAndView mv = new ModelAndView();
		if (Integer.parseInt(session.getAttribute("userpower").toString())>=1000) {
			mv.addObject("Type", 3);
		}
		else if (Integer.parseInt(session.getAttribute("userpower").toString())>=500) {
			mv.addObject("Type", 2);
		}
		else {
			mv.addObject("Type", 1);
		}
		mv.setViewName("comput_list");
		return mv;
	}
	
	
	@RequestMapping("/download_menu_list")
	public ModelAndView downloadMenuList(){
		ModelAndView mv = new ModelAndView();
		List<MdTaizhen> userPower = dataService.getTaizhenPower();
		mv.addObject("powerlist", userPower);
		mv.setViewName("download_list");
		return mv;
	}
	
	@RequestMapping("/check")
	public String check(HttpSession session
			, Model model
			,@RequestParam(value = "taizhen") String taizhenid) {
		try{
		MdTaizhen tz = dataService.getonetaizhen(Integer.parseInt(taizhenid));
		model.addAttribute("taizhen_id", taizhenid);
		System.out.println(tz.getName() + "台阵");
			List<MdTasktable> list = tasktableService.shenhexiazaitz(taizhenid);
			System.out.println("check:"+list.size());
			model.addAttribute("list", list);
			model.addAttribute("list1", tz.getName());
			ToDBLogBean bean = new ToDBLogBean(new Date(), "查询下载申请", (String)session.getAttribute("UserName"), "查询所有人员的申请下载信息");
			logger.record(bean);
			return "rushan_check";
		}
		catch(Exception e){
			return "error";
		}
	}
	
	/**
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping("/particularcheck")
	public String particularcheck(HttpServletRequest request, Model model) {
		try{
		HttpSession session = request.getSession();
		String depID = (String) session.getAttribute("username");
		String applytime = request.getParameter("applytime");
		String applyname = request.getParameter("applyname");
		String taizhen = request.getParameter("taizhen");
		MdTasktable task = new MdTasktable();
		task.setApplytime(applytime);
		task.setApplyname(applyname);
		task.setDepid(depID);
		task.setTaizhen(taizhen);

		model.addAttribute("list3", taizhen);
		List<MdTasktable> list = userService.shenhexiazai1(task);
			System.out.println(list);
			model.addAttribute("list", list);
//			model.addAttribute("list1",user );
			ToDBLogBean bean = new ToDBLogBean(new Date(), "查询下载申请", (String)request.getSession().getAttribute("UserName"), "查询所有人员的申请下载信息");
			logger.record(bean);
			return "particularcheck";
		}
		catch(Exception e){
			return "error";
		}
	}
	@RequestMapping("/tongyixiazai")
	public ModelAndView tongyixiazai(HttpServletRequest request,Model model) {
		try{
			System.out.println("yongyixiazai");
		HttpSession session=request.getSession();
		String userName = (String) session.getAttribute("UserName");
		//设置下载时间的时间截
		Date deadline1 = new Date();
		Calendar calendar = Calendar.getInstance(); //得到日历
		calendar.add(Calendar.DAY_OF_MONTH, +7);  //设置为7天
		deadline1 = calendar.getTime();   //得到+7天的时间
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //设置时间格式
		String deadline = sdf.format(deadline1);    //格式化时间
		/*String ID1 = request.getParameter("ID");*/
		String applytime = request.getParameter("applytime");
	    String applyname = request.getParameter("applyname");
	    String taizhen = request.getParameter("taizhen");
	   final String applytime1 = request.getParameter("applytime");
	   final String applyname1 = request.getParameter("applyname");
		/*final int ID = Integer.parseInt(ID1);*/
		String check="1";
		MdTasktable mtt = new MdTasktable();
		mtt.setApplyname(applyname);
		mtt.setApplytime(applytime);
		mtt.setReviewed(check);
		mtt.setAuditor(userName);
		mtt.setDeadline(deadline);
		final TLog t = new TLog();
		t.setEvent("同意下载申请");
		t.setLogCreater(request.getSession().getAttribute("username").toString());
		t.setLogTime(new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss").format(new Date()));
		t.setLogtype("修改");
		t.setTablename("md_filepath");
		tasktableService.shenpixiazai(mtt);
		/*User list=userService.finduuid(ID);*/
		/*final String twuuid = list.getTw_uuid();
		System.out.println(twuuid);*/
		List<MdTasktable> list=tasktableService.finduuid1(mtt);
		for( int i = 0 ; i < list.size() ; i++) 
	        {
	            System.out.println("str="+list.get(i).getId()+"");
	            final int ID = list.get(i).getId();
	            final String twuuid = list.get(i).getTwUuid();
	            System.out.println("init1");
	            
		new Thread(new Runnable() {
			@Override
			public void run() {
					//PreparedStatement prepareStatement = connection.prepareStatement("UPDATE mdtasktable SET filepath = ? WHERE id = ?");
					Mdtw tw = twService.getSecs(twuuid);
					List<Mdtz> tzlist = tzService.getTzByuuid(twuuid);
					List<MdFilepath> pathlist = new ArrayList<>();
					for (int j = 0; j < tzlist.size(); j++) {
						pathlist.add(pathService.getPathByuuid(tzlist.get(j).getUuid()));
					}
					System.out.println(tzlist.size()+" "+pathlist.size());
					
					
					System.out.println("init2");
					
//					String createdFilePath = EvtFileUtils.mergeEvtFile(twuuid,pathlist,tzlist,tw);
//					System.out.println("1:"+createdFilePath);
//					MdTasktable mtk = tasktableService.getByid(ID);
//					mtk.setFilepath(createdFilePath);
//					tasktableService.update(mtk);
					
					MdTasktable mtk2 = new MdTasktable();
					mtk2.setApplyname(applyname1);
					mtk2.setApplytime(applytime1);
					int irow = tasktableService.countsums(mtk2);
			
					System.out.println(" 开始执行0"   + " " + irow );
					if(irow==0)
					{
	                    List<String> lstFiles=new ArrayList<String>();
	                    List<MdTasktable> lis = tasktableService.checks(applyname1, applytime1);
						for (MdTasktable mdTasktable : lis) {
							lstFiles.add(mdTasktable.getFilepath());
						}
						
						
						/*lstFiles.add("/tmp/SD.YJCT.2016.336.9.BHN.txt");
						lstFiles.add("/tmp/SD.YJCT.2016.336.9.BHZ.txt");*/
						SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");//设置日期格式
						System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
						String startDate = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
//						String zipFile = PropsUtils.getMergePath("mergepath").trim()+UUID.randomUUID()+"$"+startDate+".zip";
						String zipFile = "/home/hdfs/merge_result/"+UUID.randomUUID()+"$"+startDate+".zip";
						//String zipFile = "/tmp/"+df.format(new Date())+".zip";
						try {
							t.setRemark("修改成功");
							ZipUtils.hdfsdoCompress(lstFiles, zipFile);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							t.setRemark("修改失败");
							e.printStackTrace();
						}
						
						MdTasktable mtt3 = new MdTasktable();
						mtt3.setAllfilepath(zipFile);
						mtt3.setApplyname(applyname1);
						mtt3.setApplytime(applytime1);
						if (tasktableService.updates(mtt3)==1) {
							System.out.println("修改成功");
						}
						else {
							System.out.println("修改失败");
						}
					}
			}
			
		}).start();
	        }
		
		request.setAttribute("xiazaishenhe","Success");
		System.out.println("end>>>>>>>>>>>>>>");
		return new ModelAndView("redirect:/data/check?taizhen="+taizhen);
		}
		
		catch(Exception e){
			return new ModelAndView("error1");
		}
	}	
	
	
	
	
	@RequestMapping("/downloadapply")
	public ModelAndView downloadapply(HttpServletRequest request){
		ModelAndView mv = new ModelAndView();
		/*List<String> userPower = dataService.getTaizhenPower();*/
		List<MdTaizhen> userPower = dataService.getTaizhenPower();
		mv.addObject("powerlist", userPower);
		mv.setViewName("downloadapply");
		return mv;
	}
	
	@RequestMapping("/chaxunxiazai")
	public String chaxunxiazai(HttpServletRequest request
			, Model model
			, Mdtw mdtw
			,HttpSession session
			) {
		String taizhenid = request.getParameter("taizhen");
		model.addAttribute("list4", taizhenid);
		String tw_name = request.getParameter("tw_name");
		String start = request.getParameter("start");
		String end = request.getParameter("end");
		
//		String DepID = session.getAttribute("DepID").toString();
//		System.out.println(DepID);
//		String tz_staname = request.getParameter("tz_staname");
//		String tz_stype = request.getParameter("tz_stype");
//		String tw_starttime = request.getParameter("tw_starttime");
//		String remark = request.getParameter("remark");
//		String start = request.getParameter("start");
//		String datasec = request.getParameter("datasec");
//		String end = request.getParameter("end");
//		if (DepID != null && tw_name != null && start != null && end != null) {
//			user.setDepID(DepID);
//			user.setTw_name(tw_name);
//			user.setTz_staname(tz_staname);
//			user.setTz_stype(tz_stype);
//			user.setTw_starttime(tw_starttime);
//			user.setRemark(remark);
//			user.setStart(start);
//			user.setDatasec(datasec);
//			user.setEnd(end);
//			user.setTaizhen(taizhen);
//			System.out.println(user);
//			List<User> list2 = userService.chaxunxiazai(user);
//			System.out.println(list2);
//			List<User> list1=userService.chaxuntztaiwang(taizhen);
//			model.addAttribute("list1", list1);
//			model.addAttribute("list", list2);
//			ToDBLogBean bean = new ToDBLogBean(new Date(), "查看台网信息", (String)request.getSession().getAttribute("UserName"), "查询需要下载的数据文件");
//			logger.record(bean);
//			return "/dizhenju/addxiazai.jsp";
//		}else 
//		if(DepID != null && tw_name != null && start == null && end == null){
		System.out.println(tw_name+"xxx"+start+"xxx"+end);
		if(tw_name != null && start == null && end == null||tw_name != null && start.equals("''") && end.equals("''")){
			/*request.setAttribute("chaxunxiazai","defeat1");*/
			Mdtw tw = new Mdtw();
			tw.setTwname(tw_name);
			tw.setTaizhen(Integer.parseInt(taizhenid));
			List<Mdtw> list2 = twService.chaxunxiazai1(tw);
			List<Mdtw> list1=twService.chaxuntztaiwang(Integer.parseInt(taizhenid));
			model.addAttribute("list1", list1.get(0));
			model.addAttribute("list", list2);
			model.addAttribute("list2",1);
			model.addAttribute("taizhenid",taizhenid);
			
			
			return "addxiazai";
		} 
//		else if(DepID != null && tw_name == null && start == null && end == null){
//			/*request.setAttribute("chaxunxiazai","defeat1");*/
//			user.setDepID(DepID);
//			user.setTw_name(tw_name);
//			user.setTz_staname(tz_staname);
//			user.setTz_stype(tz_stype);
//			user.setTw_starttime(tw_starttime);
//			user.setRemark(remark);
//			user.setStart(start);
//			user.setDatasec(datasec);
//			user.setEnd(end);
//			user.setTaizhen(taizhen);
//			System.out.println(user);
//			List<User> list2 = userService.chaxunxiazai1(user);
//			List<User> list1=userService.chaxuntztaiwang(taizhen);
//			
//			model.addAttribute("list1", list1);
//			model.addAttribute("list", list2);
//			return "/dizhenju/addxiazai.jsp";
//		}
		else{
			System.out.println("else");
			request.setAttribute("chaxunxiazai","defeat");
			List<Mdtw> list1=twService.chaxuntztaiwang(Integer.parseInt(taizhenid));
			model.addAttribute("list1", list1.get(0));
			return "addxiazai";
//		}
			}
		
	}
	
	// 列出所有本人历史申请的下载信息
	@RequestMapping("/xiazailishi")
	public String xiazailishi(HttpServletRequest request
							, Model model
							,@RequestParam(value = "taizhen") String taizhen) {
		try {
			HttpSession session = request.getSession();
			String name = session.getAttribute("username").toString();
//			System.out.println("username:"+name);
//			String taizhen=request.getParameter("taizhen");
//			taizhen = new String (taizhen.getBytes("ISO-8859-1"),"UTF-8");
//			taizhen=java.net.URLDecoder.decode(taizhen, "UTF-8");
			
			model.addAttribute("list4", taizhen);
			MdTaizhen list3 = dataService.getonetaizhen(Integer.parseInt(taizhen));
//			taizhen=list3.getName();
			model.addAttribute("list3", list3.getName());
			tasktableService.xiazaidead();
			MdTasktable mtt = new MdTasktable();
			System.out.println(taizhen);
			mtt.setApplyname(name);
			mtt.setTaizhen(taizhen);
			List<MdTasktable> list = tasktableService.xiazailishi(mtt);
			System.out.println(list + "申请下载的信息");
			model.addAttribute("list", list);
			List<Mdtw> list1=twService.chaxuntaiwang();
			model.addAttribute("list1", list1);
			TLog t = new TLog();
			t.setEvent("查看历史下载");
			t.setLogCreater(request.getSession().getAttribute("username").toString());
			t.setLogTime(new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss").format(new Date()));
			t.setLogtype("查看");
			t.setTablename("t_task");
			logService.add(t);
			return "xiazai";
		} catch (Exception e) {
			System.out.println(e);
			return "error1";
		}
	}
	@RequestMapping("/particular")
	public String particular(HttpServletRequest request, Model model) {
		try {
			HttpSession session = request.getSession();
			String name = session.getAttribute("username").toString();
			MdTasktable mtt = new MdTasktable();
			mtt.setApplyname(name);
			String applytime = request.getParameter("applytime");
			String taizhen = request.getParameter("taizhen");
			model.addAttribute("list4", taizhen);
			mtt.setApplytime(applytime);
			tasktableService.xiazaidead();
			List<MdTasktable> list = tasktableService.xiazailishi1(mtt);
			System.out.println(list + "申请下载的信息");
			model.addAttribute("list", list);
			List<Mdtw> list1=twService.chaxuntaiwang();
			model.addAttribute("list1", list1);
			TLog t = new TLog();
			t.setEvent("查看历史下载");
			t.setLogCreater(request.getSession().getAttribute("username").toString());
			t.setLogTime(new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss").format(new Date()));
			t.setLogtype("查看");
			t.setTablename("t_task");
			logService.add(t);
			return "particular";
		} catch (Exception e) {
			System.out.println(e);
			return "error";
		}
	}
	
	@RequestMapping("/shenqingxiazai")
	public void shenqingxiazai(HttpServletRequest request, Model model) {
	
		try{
			String uuid = request.getParameter("uuid");
			System.out.println("uuid"+uuid);
			String datasec="";
			String tw_name1="";
			String remark = request.getParameter("remark");
			String taiwang = request.getParameter("taiwang");
			System.out.println("uuid:"+uuid);
		Date date=new Date();
		  DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		  String time=format.format(date);
		if (uuid != null) {
			//寻找持续时间
			datasec = twService.getSecs(uuid).getDatasec().toString();
			//查询台网名称
			tw_name1 = twService.getSecs(uuid).getTwname();
			System.out.println("222222"+datasec+tw_name1);

				
				MdTasktable mtt = new MdTasktable();
				mtt.setDepid("admin");
				mtt.setTwUuid(uuid);
				mtt.setTwName(tw_name1);
				mtt.setRemark(remark);
				mtt.setReviewed("0");
				mtt.setApplytime(time);
				mtt.setDatasec(datasec);
				System.out.println(111);
				System.out.println(request.getSession().getAttribute("username").toString());
				mtt.setApplyname(request.getSession().getAttribute("username").toString());
				/**
				 * null值
				 */
//				mtt.setTaizhen(taiwang);
				mtt.setTaizhen("1");
				tasktableService.addtask(mtt);
				TLog t = new TLog();
				t.setEvent("申请下载");
				t.setLogCreater(request.getSession().getAttribute("username").toString());
				t.setLogTime(new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss").format(new Date()));
				t.setLogtype("添加");
				t.setTablename("md_tasktable");
				logService.add(t);
				request.setAttribute("shenqingxiazai","Success");
			//return "forward:/xiazailishi.do";
		} else {
			request.setAttribute("shenqingxiazai","defeat");
			//return "forward:/chaxunxiazai.do";
		}}
		catch(Exception e){
			//return "error.jsp";
		}
	}
	
	
	
	@RequestMapping("/computeApply")
	public ModelAndView computeApply(HttpServletRequest request){
		ModelAndView mv = new ModelAndView();
		HttpSession session = request.getSession();
		String username = session.getAttribute("username").toString();
		
		int id = userService.username2id(username);
		List<TTask> list = taskService.getlishi(id);
		
		mv.addObject("tasks", list);
		mv.setViewName("compute_history");
		
		return mv;
	}
//	
//	@RequestMapping("/computeUnderway")
//	public ModelAndView computeUnderway(HttpServletRequest request){
//		ModelAndView mv = new ModelAndView();
//		Task task = new Task();
//		HttpSession session = request.getSession();
//		String userid = session.getAttribute("UserID").toString();
//		task.setUserid(userid);
//		List<Task> list = dataService.getTaskListUnderway();
//		List<Task> list1 = dataService.getTaskListUnderway1();
//		mv.addObject("tasks", list);
//		mv.addObject("task", list1);
//		mv.setViewName("computeUnderway");
//		ToDBLogBean bean = new ToDBLogBean(new Date(), "查看进行中计算任务", (String)request.getSession().getAttribute("UserName"), "");
//		logger.record(bean);
//		return mv;
//	}
//	
	
	
	@RequestMapping("/apply")
	public ModelAndView handleApply(HttpSession session
			,HttpServletRequest request
			,@RequestParam(value = "task_id") String task_id
			,@RequestParam(value = "apply") String apply){
		ModelAndView mv = new ModelAndView();
		// 设置下载时间的时间截
		Date deadline1 = new Date();
		Calendar calendar = Calendar.getInstance(); // 得到日历
		calendar.add(Calendar.DAY_OF_MONTH, +7); // 设置为7天
		deadline1 = calendar.getTime(); // 得到+7天的时间
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 设置时间格式
		String deadline = sdf.format(deadline1); // 格式化时间
		
		//设置下载时间的时间截
		Date checktime1 = new Date();
		String checktime = sdf.format(checktime1);    //格式化时间
		String name = session.getAttribute("user_name").toString();
		String username = session.getAttribute("username").toString();
		System.out.println("time"+deadline+" "+checktime);
		System.out.println("apply:"+username+" "+name);
		TLog t = new TLog();
		t.setEvent("审核计算任务");
		t.setLogCreater(request.getSession().getAttribute("username").toString());
		t.setLogTime(new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss").format(new Date()));
		t.setLogtype("查看");
		t.setTablename("t_task_check");
		if("y".equals(apply)){
				TTaskCheck tcheck = taskcheckService.getone(Integer.parseInt(task_id));
				TTask nowtask = new TTask();
				nowtask.setUserId(tcheck.getUserId());
				nowtask.setMonitor(tcheck.getMonitor());
				nowtask.setParameter(tcheck.getParameter());
				nowtask.setTimeStart(tcheck.getTimeStart());
				nowtask.setTimeEnd(tcheck.getTimeEnd());
				nowtask.setMubanPath(tcheck.getMubanPath());
				nowtask.setStatus("1");
				nowtask.setReviewed(2);
				nowtask.setDeadline(deadline);
				nowtask.setTaizhen(tcheck.getTaizhen());
				nowtask.setAuditor(username);
				nowtask.setChecktime(checktime);
				t.setRemark("同意");
				if (taskService.add(nowtask)==1) {
					if(taskcheckService.dele(Integer.parseInt(task_id))==1)
					{
						session.setAttribute("apply","Success");
					}
				}
				
		}else{
				t.setRemark("拒绝");
				TTaskCheck tcheck = taskcheckService.getone(Integer.parseInt(task_id));
				TTask nowtask = new TTask();
				nowtask.setUserId(tcheck.getUserId());
				nowtask.setMonitor(tcheck.getMonitor());
				nowtask.setParameter(tcheck.getParameter());
				nowtask.setTimeStart(tcheck.getTimeStart());
				nowtask.setTimeEnd(tcheck.getTimeEnd());
				nowtask.setMubanPath(tcheck.getMubanPath());
				nowtask.setStatus("1");
				nowtask.setTaizhen(tcheck.getTaizhen());
				nowtask.setReviewed(1);
				nowtask.setDeadline(deadline);
				nowtask.setAuditor(username);
				nowtask.setChecktime(checktime);
				if (taskService.add(nowtask)==1) {
					if(taskcheckService.dele(Integer.parseInt(task_id))==1)
					{
						session.setAttribute("apply","Defeat");
					}
				}
		}
		logService.add(t);
		List<TTaskCheck> list = taskcheckService.getTaskList();
		for (int i = 0; i < list.size(); i++) {
			list.get(i).setDeadline(userService.id2username(list.get(i).getUserId()));
		}
//		mv.addObject("username",username);
		mv.addObject("tasks", list);
		mv.setViewName("comput_hxg");
		return mv;
	}
	
	@RequestMapping("/download/compute_result")
	public void downloadComputeResult(HttpServletRequest request,HttpServletResponse response){
		String taskID = request.getParameter("task_id");
		String taskType = request.getParameter("task_type");

		String type = taskType.split("_").length == 3? "MR":"spark";
		response.setHeader("Content-Disposition", "attachment;filename="+taskID+"_"+type+".txt");
		SequenceInputStream sis = taskresultService.getResultInputStream(Integer.parseInt(taskID));
		try {
			IOUtils.copy(sis, response.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	
	@RequestMapping("/check_comput")
	public void computCheck(HttpServletRequest request,HttpServletResponse response,@RequestParam(value = "uns") String uns) throws IOException{
		String taizhen = request.getParameter("taizhen");
		String tz = request.getParameter("tz");
		System.out.println("check_comput:"+uns);
		int userid = userService.username2id(uns);
		System.out.println("check_comput:"+userid);
		String parameter = request.getParameter("parameter");
		String start = request.getParameter("start");
		String end = request.getParameter("end");
		System.out.print("taizhen"+taizhen);
		//截取字符串 yyyy-MM-dd HH:mm:ss yyyyMMddHH0000
				String a1= start.substring(0, 4);
				String b1=start.substring(5,7);
				String c1=start.substring(8, 10);
				String d1=start.substring(11, 13);
				start=a1+b1+c1+d1+"0000";
				
				//截取字符串 yyyyMMddHH0000
				//yyyy-MM-dd HH:mm:ss
				String a2= end.substring(0, 4);
				String b2=end.substring(5,7);
				String c2=end.substring(8, 10);
				String d2=end.substring(11, 13);
				end=a2+b2+c2+d2+"0000";
		
				List<MdTaizhen> list = new ArrayList<>();
				list = dataService.getAllTaizhen();
				String uploadpath=list.get(0).getUploadpath();
				System.out.print("uploadpath:"+uploadpath);
		boolean checkRest = dataService.checkComput(tz, parameter, start, end,taizhen,uploadpath);
		TLog t = new TLog();
		t.setEvent("申请计算任务");
		t.setLogCreater(request.getSession().getAttribute("username").toString());
		t.setLogTime(new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss").format(new Date()));
		t.setLogtype("添加");
		t.setTablename("t_task_check");
		if (checkRest) {
			t.setRemark("申请成功");
			System.out.println("if");
			Date deadline1 = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 设置时间格式
			String deadline = sdf.format(deadline1); 
			TTaskCheck tasks = new TTaskCheck();
			tasks.setUserId(userid);
			tasks.setMonitor(tz);
			tasks.setParameter(parameter);
			tasks.setTimeStart(start);
			tasks.setTimeEnd(end);
			tasks.setMubanPath("hdfs://10.37.181.32:8020/user/hdfs/huxiangguan/muban/1475045815344.txt");
			tasks.setTaizhen(taizhen);
			tasks.setApplytime(deadline);
			tasks.setStatus("0");
			PrintWriter writer = response.getWriter();
			if (taskcheckService.add(tasks)==1) {
				writer.write("{\'success\':"+checkRest+"}");
			}
			else {
				writer.write("{\'success\':"+!checkRest+"}");
			}
			
		}
		else {
			t.setRemark("申请失败");
		}
		logService.add(t);
	}
	
	@RequestMapping("/compute/compute_hxg")
	public ModelAndView getComputeXHG(HttpSession session,HttpServletRequest request,HttpServletResponse response){
		ModelAndView mv = new ModelAndView();
		List<TTaskCheck> list = taskcheckService.getTaskList();
		for (int i = 0; i < list.size(); i++) {
			list.get(i).setDeadline(userService.id2username(list.get(i).getUserId()));
		}
		//mv.addObject("username",request.getAttribute("username"));
//		System.out.println("username:"+session.getAttribute("username"));
		//request.setAttribute("users",session.getAttribute("username"));
		mv.addObject("tasks", list);
//		mv.addObject(attributeValue)
		mv.setViewName("comput_hxg");
		ToDBLogBean bean = new ToDBLogBean(new Date(), "查看计算任务", (String)request.getSession().getAttribute("UserName"), "");
		logger.record(bean);
		return mv;
	}
//	
//	@RequestMapping("download/download_xb")
//	public ModelAndView getDownloadXB(HttpServletRequest request,HttpServletResponse response){
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("comput_xb");
//		return mv;
//	}
//	
//	@RequestMapping("/download/download_dc")
//	public ModelAndView getDownloadDC(HttpServletRequest request,HttpServletResponse response){
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("comput_dc");
//		return mv;
//	}
//	
	
	
	
//	@RequestMapping("/list/tw_record")
//	public ModelAndView getTWRecordList(HttpServletRequest request){
//		ModelAndView mv = new ModelAndView();
//		List<TWMetaInfo> list = new ArrayList<>();
//		String taizhen=request.getParameter("taizhenname");
//		try {
//			taizhen = new String(taizhen.getBytes("ISO-8859-1"),"UTF-8");
//			taizhen=java.net.URLDecoder.decode(taizhen, "UTF-8");
//		} catch (UnsupportedEncodingException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		System.out.print("台阵"+taizhen);
//		String sql = "SELECT * FROM mdtw a,`mdtaizhen` b WHERE a.taizhen=b.name AND b.uploadpath=? ORDER BY starttime";
//		ResultSet resultSet = null;
//		
//		try(
//			Connection connection = DBUtils.getConnection();
//			PreparedStatement prepareStatement = connection.prepareStatement(sql);
//		){
//			prepareStatement.setString(1,taizhen);
//			resultSet = prepareStatement.executeQuery();
//			while(resultSet.next()){
//				TWMetaInfo info = new TWMetaInfo();
//				info.setUuid(resultSet.getString(1));
//				info.setTwName(resultSet.getString(6));
//				info.setStaNum(resultSet.getInt(5));
//				info.setStartDate(resultSet.getString(10));
//				info.setEndDate(resultSet.getString(12));
//				list.add(info);
//			}
//		}catch(Exception e){
//			e.printStackTrace();
//		}finally{
//			if(resultSet != null){
//				try {
//					resultSet.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}finally{
//					if(resultSet != null){
//						resultSet = null;
//					}
//				}
//			}
//		}
//		mv.addObject("tw_list",list);
//		mv.setViewName("tw_delete");
//		return mv;
//	}
//	
//	@RequestMapping("/del/tw_record")
//	public void deleteTWRecord(HttpServletRequest request, HttpServletResponse response) {
//		String uuid = request.getParameter("uuid");
//		System.out.println("删除文件uuid" + request.getParameter("uuid"));
//		String sql = "DELETE mdtz,mdfilepath,mdtw FROM mdtz LEFT JOIN mdfilepath ON mdtz.uuid=mdfilepath.tz_uuid LEFT JOIN mdtw ON mdtw.uuid=mdtz.tw_uuid WHERE mdtw.uuid= ?";
//		String sql1 = "SELECT mdfilepath.filepath FROM mdtw,mdtz,mdfilepath WHERE mdtw.uuid= ? AND mdtw.uuid=mdtz.tw_uuid AND mdtz.uuid=mdfilepath.tz_uuid";
//		ResultSet resultSet = null;
//		
//		try (Connection connection = DBUtils.getConnection();
//				PreparedStatement prepareStatement = connection.prepareStatement(sql1);) {
//			prepareStatement.setString(1, uuid);
//			resultSet = prepareStatement.executeQuery();
//			while (resultSet.next()) {
//				FileDao a = new FileDao();
//				Result<HDFSFile> b= a.delete(resultSet.getString(1));
//				/*System.out.println("删除文件地址" + resultSet.getString(1));
//				File file = new File(resultSet.getString(1));
//				file.delete();*/
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		try (Connection connection = DBUtils.getConnection();
//				PreparedStatement prepareStatement = connection.prepareStatement(sql);
//
//		) {
//			prepareStatement.setString(1, uuid);
//			prepareStatement.executeUpdate();
//			response.getWriter().write("{'\result\':\'ok\'}");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//	}
}