package org.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.log.Log4jForProjectLogger;
import org.log.ToDBLogBean;
import org.pojo.TLog;
import org.service.IClusterService;
import org.service.ILogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/cluster")
public class ClusterController {
	private Log4jForProjectLogger logger = new Log4jForProjectLogger(ClusterController.class);
	@Autowired
	IClusterService clusterService;
	@Autowired
	ILogService logService;
	
	@RequestMapping("/general")
	public ModelAndView general(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mv = new ModelAndView();
		TLog t = new TLog();
		t.setEvent("查看集群状态");
		t.setLogCreater(request.getSession().getAttribute("username").toString());
		t.setLogTime(new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss").format(new Date()));
		t.setLogtype("查看");
		t.setTablename("dzj_monitor");
		List<String> hosts = clusterService.getHosts();
		mv.addObject("hosts", hosts);
		mv.setViewName("/cluster_state");
		logService.add(t);
		return mv;
	}
	
	@RequestMapping("/cpu")
	public void getCpuState(HttpServletRequest request,HttpServletResponse response){
		String hostname = request.getParameter("hostname");
		String cpuState = clusterService.getCpuState(hostname);
		ServletOutputStream outputStream = null;
		TLog t = new TLog();
		t.setEvent("查看集群cpu状态");
		t.setLogCreater(request.getSession().getAttribute("username").toString());
		t.setLogTime(new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss").format(new Date()));
		t.setLogtype("查看");
		t.setTablename("dzj_monitor");
		try {
			outputStream = response.getOutputStream();
			outputStream.write(cpuState.getBytes());
			outputStream.flush();
			outputStream.close();
			logService.add(t);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(outputStream != null){
				try {
					outputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					if(outputStream != null){
						outputStream = null;
					}
				}
			}
		}
	}
	
	@RequestMapping("/mem")
	public void getMemState(HttpServletRequest request,HttpServletResponse response){
		String hostname = request.getParameter("hostname");
		String memState = clusterService.getMemState(hostname);
		ServletOutputStream outputStream = null;
		TLog t = new TLog();
		t.setEvent("查看集群内存状态");
		t.setLogCreater(request.getSession().getAttribute("username").toString());
		t.setLogTime(new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss").format(new Date()));
		t.setLogtype("查看");
		t.setTablename("dzj_monitor");
		try {
			outputStream = response.getOutputStream();
			outputStream.write(memState.getBytes());
			outputStream.flush();
			outputStream.close();
			logService.add(t);
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
					if(outputStream != null){
						outputStream = null;
					}
				}
			}
		}
	}
	
	@RequestMapping("/disk")
	public void getDiskState(HttpServletRequest request,HttpServletResponse response){
		String hostname = request.getParameter("hostname");
		String diskState = clusterService.getDiskState(hostname);
		ServletOutputStream outputStream = null;
		TLog t = new TLog();
		t.setEvent("查看集群disk状态");
		t.setLogCreater(request.getSession().getAttribute("username").toString());
		t.setLogTime(new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss").format(new Date()));
		t.setLogtype("查看");
		t.setTablename("dzj_monitor");
		try {
			outputStream = response.getOutputStream();
			outputStream.write(diskState.getBytes());
			outputStream.flush();
			outputStream.close();
			logService.add(t);
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
					if(outputStream != null){
						outputStream = null;
					}
				}
			}
		}
	}
	
	@RequestMapping("/overview")
	public void getOverview(HttpServletRequest request,HttpServletResponse response){
		String overview = clusterService.getOverview();
		try(
			ServletOutputStream outputStream = response.getOutputStream();
		){
			outputStream.write(overview.getBytes());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@RequestMapping("/details")
	public void getDetails(HttpServletRequest request,HttpServletResponse response){
		String details = clusterService.getDetails();
		try(
			ServletOutputStream outputStream = response.getOutputStream();
		){
			outputStream.write(details.getBytes());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
