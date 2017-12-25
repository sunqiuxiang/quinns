package org.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.pojo.TLog;
import org.service.ILogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/log")
public class LogController {
	@Autowired ILogService logService;
	
	@RequestMapping("/list")
	public ModelAndView logList(){
		ModelAndView mv = new ModelAndView();
		List<TLog> logs = logService.getlist();
		List<String> events = logService.distincts();
		mv.addObject("logs", logs);
		mv.addObject("events", events);
		mv.setViewName("log_list");
		return mv;
	}
	
	@RequestMapping("/query")
	public ModelAndView queryLog(HttpServletRequest request,HttpServletResponse response){
		String startTime = request.getParameter("startTime");
		String endTime = request.getParameter("endTime");
		String event = request.getParameter("event");
		String userName = request.getParameter("userName");
		System.out.println(startTime);
		System.out.println(endTime);
		ModelAndView mv = new ModelAndView();
		List<TLog> logs = logService.query(startTime, endTime, event, userName);
		List<String> events = logService.distincts();
		mv.addObject("logs", logs);
		mv.addObject("events", events);
		mv.setViewName("log_list");
		return mv;
	}
	
	
}
