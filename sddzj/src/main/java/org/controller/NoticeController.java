package org.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.pojo.TLog;
import org.pojo.TNotice;
import org.service.ILogService;
import org.service.INoticeService;
import org.service.IUserService;
import org.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/notice")
public class NoticeController {
	@Autowired INoticeService noticeService;
	@Autowired IUserService userService;
	@Autowired ILogService logService;
	
	@RequestMapping("/list")
	public ModelAndView getNoticeList(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mv = new ModelAndView();
		List<TNotice> noticelist = noticeService.getlist();
		for (int i = 0; i < noticelist.size(); i++) {
			if(noticelist.get(i).getNoticeTitle().length()>30){
					noticelist.get(i).setNoticeTitle(noticelist.get(i).getNoticeTitle().substring(0, 30)+"...");
				}
		}
		mv.addObject("notices", noticelist);
		mv.setViewName("proclamation1");
		
		return mv;
	}
	
	
	@RequestMapping("/list1")
	public ModelAndView getNoticeList1(HttpServletRequest request
										,HttpServletResponse response
										,@RequestParam(value = "uuid") String uuid){
		ModelAndView mv = new ModelAndView();
		TNotice notice = noticeService.getnoticeByuuid(uuid);
		System.out.println(notice.getNoticeStatus());
		mv.addObject("notices", notice);
		mv.setViewName("proclamation");
		return mv;
	}
	
	@RequestMapping("/create_notice")
	public @ResponseBody Map<String, String> createNotice(HttpSession session,
			 HttpServletRequest request
			,HttpServletResponse response
			,@RequestParam(value = "notice_title") String notice_title
			,@RequestParam(value = "notice_content") String notice_content){
			TNotice tt = new TNotice();
			Map<String, String> map = new HashMap<>();
			tt.setNoticeTitle(notice_title);
			tt.setNoticeContent(notice_content);
			tt.setUuid(UUID.randomUUID().toString());
			tt.setNoticeStatus(200);
			tt.setNoticeCreater(session.getAttribute("username").toString());
			tt.setNoticeStartTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
			tt.setDzjUserId(userService.username2id(session.getAttribute("username").toString()));
			TLog t = new TLog();
			t.setEvent("发布公告");
			t.setLogCreater(request.getSession().getAttribute("username").toString());
			t.setLogTime(new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss").format(new Date()));
			t.setLogtype("添加");
			t.setTablename("t_notice");
			if (noticeService.add(tt)==1) {
				t.setRemark("创建成功");
				map.put("res", "suc");
			}else {
				t.setRemark("创建失败");
				map.put("res", "err");
			}
			return map;
	}
	
}
