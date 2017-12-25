package org.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.log.Log4jForProjectLogger;
import org.log.ToDBLogBean;
import org.service.FileService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bingh.filemanager.HDFSFile;
import com.bingh.utils.FileUtils;


@Controller
@RequestMapping("/file")
public class Filecontroller {
	private Log4jForProjectLogger logger = new Log4jForProjectLogger(Filecontroller.class);
	private FileService fileService = new FileService();
	@RequestMapping("/list")
	public ModelAndView getList(HttpServletRequest request,HttpServletResponse response){
		
		ModelAndView mv = new ModelAndView();
		String filePath = request.getParameter("filePath");
		
		if("".equals(filePath) || null == filePath || "/user".equals(filePath) || "/".equals(filePath)){
			filePath = "/user/hdfs";
		}
		String fileParent = FileUtils.formatFileParent(filePath);
		if(!"/".equals(fileParent)){
			if(fileParent.endsWith("/")){
				fileParent = fileParent.substring(0, fileParent.length() - 1);
			}
		}
		List<HDFSFile> list = fileService.getList(filePath);
		if(list == null){
			mv.addObject("msg", "faild");
		}else{
			Collections.sort(list,new Comparator<HDFSFile>() {

				@Override
				public int compare(HDFSFile f1, HDFSFile f2) {
					// TODO Auto-generated method stub
					if(f2.isDir()){
						return 1;
					}
					return -1;
				}
				
			});
			if(list.size() > 0){
				mv.addObject("list", list);
			}
			
		}
		mv.addObject("currentFile",filePath);
		mv.addObject("fileParent", fileParent);
		mv.setViewName("file_manager");
		/*System.out.println("当前文件路径"+filePath);
		System.out.println("父文件路径"+fileParent);*/
		ToDBLogBean bean = new ToDBLogBean(new Date(), "查看文件列表", (String)request.getSession().getAttribute("UserName"), filePath);
		logger.record(bean);
		return mv;
	}
	
	@RequestMapping("/download")
	public String downloadFile(HttpServletRequest request,HttpServletResponse response){
		String filePath = request.getParameter("filePath");
		System.out.println(filePath);
		//InputStream inputStream = fileService.downloadFile(filePath);
		response.setCharacterEncoding("UTF-8");
		response.setContentType("multipart/form-data");
		response.setHeader("Content-Disposition", "attachment;fileName="+FileUtils.formatFileName(filePath));
		try (
			InputStream inputStream = fileService.downloadFile(filePath);
			ServletOutputStream outputStream = response.getOutputStream();
		){
			//ServletOutputStream outputStream = response.getOutputStream();
			//IOUtils.copy(inputStream, outputStream);
			byte[] b = new byte[2048];
			int len = 0;
			while((len = inputStream.read(b)) != -1){
				outputStream.write(b, 0, len);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ToDBLogBean logBean = new ToDBLogBean(new Date(), "下载文件", (String)request.getSession().getAttribute("UserName"), filePath);
		logger.record(logBean);
		return null;
	}
	@RequestMapping("/delete")
	public void deleteFile(HttpServletRequest request,HttpServletResponse response){
		String filePath = request.getParameter("filePath");
		String result = fileService.deleteFile(filePath);
		ServletOutputStream outputStream = null;
		try {
			outputStream = response.getOutputStream();
			outputStream.write(result.getBytes());
			ToDBLogBean logBean = new ToDBLogBean(new Date(), "删除文件", (String)request.getSession().getAttribute("UserName"), filePath);
			logger.record(logBean);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(outputStream != null){
				try {
					outputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					outputStream = null;
				}
			}
		}
	}
	
	@RequestMapping("/rename")
	public void renameFile(HttpServletRequest request,HttpServletResponse response){
		String oldPath = request.getParameter("oldPath");
		String newPath = request.getParameter("newPath");
		String result = fileService.renameFile(oldPath, newPath);
		ToDBLogBean logBean = new ToDBLogBean(new Date(), "重命名文件", (String)request.getSession().getAttribute("UserName"), oldPath+"->"+newPath);
		logger.record(logBean);
		ServletOutputStream outputStream = null;
		try {
			outputStream = response.getOutputStream();
			outputStream.write(result.getBytes());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(outputStream != null){
				try {
					outputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					outputStream = null;
				}
			}
		}
	}
	/**
	 * 创建文件夹
	 * @param request
	 * @param response
	 */
	@RequestMapping("/mkdir")
	public void mkdir(HttpServletRequest request,HttpServletResponse response){
		String filePath = request.getParameter("filePath");
		try {
			filePath = new String(filePath.getBytes("iso8859-1"),"utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String result = fileService.mkdir(filePath);
		ToDBLogBean logBean = new ToDBLogBean(new Date(), "新建文件夹", (String)request.getSession().getAttribute("username"), filePath);
		logger.record(logBean);
		ServletOutputStream outputStream = null;
		
		try {
			outputStream = response.getOutputStream();
			outputStream.write(result.getBytes());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(outputStream != null){
				try {
					outputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					outputStream = null;
				}
			}
		}
	}
	
	/**
	 * 批量下载文件
	 * @param request
	 * @param response
	 */
	@RequestMapping("/batchdownload")
	public void batchDownload(HttpServletRequest request,HttpServletResponse response){
		String filePaths = request.getParameter("filePaths");
		filePaths.substring(0, filePaths.length()-1);
		String[] files = filePaths.split("\\^");
		
		String tempName = "";
		String fileName = "";
		for(int i=0;i< (files.length>=3?3-1:files.length);i++){
			tempName += new HDFSFile(files[i]).getFileName()+"_";
		}
		fileName = tempName+"etc.zip";
		String uuid = UUID.randomUUID().toString();
		tempName += uuid+".zip";
		response.setCharacterEncoding("UTF-8");
		response.setContentType("multipart/form-data");
		response.setHeader("Content-Disposition", "attachment;fileName="+fileName);
		try {
			File tmpFile = new File("/tmp/",tempName);
			ZipOutputStream outputStream = new ZipOutputStream(new FileOutputStream(tmpFile),Charset.forName("UTF-8"));
			for (String filePath : files) {
				InputStream inputStream = fileService.downloadFile(filePath);
				outputStream.putNextEntry(new ZipEntry(new HDFSFile(filePath).getFileName()));
				int len = 0;
				byte[] buffer = new byte[1024];
				while((len = inputStream.read(buffer))!=-1){
					outputStream.write(buffer, 0, len);
				}
				outputStream.closeEntry();
				inputStream.close();
			}
			outputStream.close();
			IOUtils.copy(new FileInputStream(tmpFile), response.getOutputStream());
			ToDBLogBean logBean = new ToDBLogBean(new Date(), "批量下载文件", (String)request.getSession().getAttribute("UserName"), filePaths);
			logger.record(logBean);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@RequestMapping("/batchdelete")
	public void batchDelete(HttpServletRequest request,HttpServletResponse response){
		String filePaths = request.getParameter("filePaths");
		filePaths.substring(0, filePaths.length()-1);
		String[] files = filePaths.split("\\^");
		String result = fileService.batchDelete(files);
		ToDBLogBean logBean = new ToDBLogBean(new Date(), "批量删除文件", (String)request.getSession().getAttribute("UserName"), filePaths);
		logger.record(logBean);
		ServletOutputStream outputStream = null;
		try {
			outputStream = response.getOutputStream();
			outputStream.write(result.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(outputStream != null){
				try {
					outputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					outputStream = null;
				}
			}
		}
	}
	
	@RequestMapping("/search")
	public ModelAndView searchFiles(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mv = new ModelAndView();
		String path = request.getParameter("path");
		String keyword = request.getParameter("keyword");
		if(keyword == null || "".equals(keyword)){
			mv.setViewName("file_searcher");
			return mv;
		}
		List<HDFSFile> files = fileService.searchFiles(path, keyword);
		mv.addObject("files", files);
		mv.setViewName("file_searcher");
		return mv;
	}
}
