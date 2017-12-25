package org.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.log.Log4jForProjectLogger;
import org.log.ToDBLogBean;
import org.model.DzjConstantM;
import org.model.DzjUserM;
import org.pojo.DzjConstant;
import org.pojo.DzjUser;
import org.pojo.DzjUserCheck;
import org.pojo.TLog;
import org.service.IConstantService;
import org.service.ILogService;
import org.service.IUserCheckService;
import org.service.IUserService;
import org.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.tools.DzjResult;
import org.tools.Md5Util;


@Controller
@RequestMapping("/user")
public class Usercontroller {
	@Autowired private IUserService UserService;
	@Autowired private IUserCheckService UserCheckService;
	@Autowired private IConstantService ConsService;
	@Autowired private ILogService logService;
	private Log4jForProjectLogger logger = new Log4jForProjectLogger(Usercontroller.class);
	
//	@RequestMapping(value = "/login", method = RequestMethod.POST)
//	@ResponseBody
//	public DzjResult getLogin(
//			@RequestParam(value = "username") String username,
//			@RequestParam(value = "password") String password,
//		    HttpSession session) {
//		DzjResult result = new DzjResult();
//		System.out.println(username+" "+password);
//		DzjUser results = UserService.login(username, password);
//		System.out.println(results.getName());
//		if ( results!=null) {
//			session.setAttribute("userpower", 50);
//			return DzjResult.ok();
//		}else{
//			result.build(400, "登录失败");
//		}
//		return result;
//	}
	
	// 列出个人信息
	@RequestMapping("/userinfo")
	public ModelAndView userinfo(HttpServletRequest request,@RequestParam(value = "userID") String userID) {
		TLog t = new TLog();
		t.setEvent("查看个人信息");
		t.setLogCreater(request.getSession().getAttribute("username").toString());
		t.setLogTime(new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss").format(new Date()));
		t.setLogtype("查看");
		t.setTablename("dzj_user");
		try{
			System.out.println(userID);
			userID = userID.replace("?v=4.0", "");
		ModelAndView mv = new ModelAndView("userinfo");
		DzjUser user = UserService.getuserbyid(Integer.parseInt(userID));
		DzjUserM userm = new DzjUserM();
		userm.setConstantname(ConsService.id2rolename(Integer.parseInt(userID)).getRolename());
		userm.setName(user.getName());
		userm.setUsername(user.getUsername());
		mv.addObject("user", userm);
		t.setRemark("查看成功");
		logService.add(t);
		return mv;
		}
		catch(Exception e){
			ModelAndView mm = new ModelAndView("error");
			t.setRemark("查看成功");
			logService.add(t);
			return mm;
		}
	}
	
	@RequestMapping("/list")
	public String list(HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		String depID = (String) session.getAttribute("DepID");
			List<DzjUser> list = UserService.findall();
			List<DzjUserM> listm = new ArrayList<>();
			TLog t = new TLog();
			t.setEvent("查询所有人员信息");
			t.setLogCreater(request.getSession().getAttribute("username").toString());
			t.setLogTime(new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss").format(new Date()));
			t.setLogtype("查看");
			t.setTablename("dzj_user");
			for (int i = 0; i < list.size(); i++) {
				DzjUserM dm = new DzjUserM();
				dm.setId(list.get(i).getId());
				dm.setName(list.get(i).getName());
				dm.setUsername(list.get(i).getUsername());
				dm.setConstantname(ConsService.id2rolename(list.get(i).getConstantid()).getRolename());
				listm.add(dm);
			}
			System.out.println(list);
			model.addAttribute("list", listm);
			t.setRemark("查看成功");
			logService.add(t);
			return "admin-role-list";
		
	}
	// 列出所有人员注册的代办信息
		@RequestMapping("/list1")
		public String list1(HttpServletRequest request, Model model) {
			TLog t = new TLog();
			t.setEvent("查看注册人员");
			t.setLogCreater(request.getSession().getAttribute("username").toString());
			t.setLogTime(new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss").format(new Date()));
			t.setLogtype("查看");
			t.setTablename("dzj_user_check");
			try{
				
				List<DzjUserCheck> list = UserCheckService.getall();
				System.out.println(list);
				model.addAttribute("list", list);
				t.setRemark("查看成功");
				logService.add(t);
				return "admin-role";
			}
			catch(Exception e){
				t.setRemark("查看失败");
				logService.add(t);
				return "error";
			}
		}
		
		// 删除个人信息
		@RequestMapping("/delete")
		public String delete(@RequestParam(value = "userID") String userID,HttpServletRequest request) {
			TLog t = new TLog();
			t.setEvent("删除临时用户");
			t.setLogCreater(request.getSession().getAttribute("username").toString());
			t.setLogTime(new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss").format(new Date()));
			t.setLogtype("删除");
			t.setTablename("dzj_user_check");
			if (UserCheckService.delone(Integer.parseInt(userID)) == 1) {
				t.setRemark("删除成功");
				logService.add(t);
			}else {
				t.setRemark("删除失败");
				logService.add(t);
			}
			System.out.println("userID=" + userID + "删除");
			request.setAttribute("shenqingpigai","deleteSuccess");
			return "forward:/list1";
		}
	
		// 更改配置权限信息
		@RequestMapping("/updateinfo")
		public String updateinfo(HttpServletRequest request,@RequestParam(value = "depID") String depID) throws Exception {
			DzjUserCheck duc = UserCheckService.getone(Integer.parseInt(depID));
			DzjUser du = new DzjUser();
			du.setName(duc.getName());
			du.setPassword(duc.getPassword());
			du.setUsername(duc.getUsername());
			du.setConstantid(3);
			TLog t = new TLog();
			t.setEvent("更改权限");
			t.setLogCreater(request.getSession().getAttribute("username").toString());
			t.setLogTime(new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss").format(new Date()));
			t.setLogtype("修改");
			t.setTablename("dzj_user");
			System.out.println("updateinfo:"+depID);
			if (depID != null ) {
				if (UserService.adduser(du)==1) {
					UserCheckService.delone(Integer.parseInt(depID));
					t.setRemark("修改成功");
					logService.add(t);
					request.setAttribute("updateinfo","Success");
					return "forward:/user/list1";
				}
				else {
					t.setRemark("修改失败");
					logService.add(t);
					request.setAttribute("updateinfo","Error");
					return "forward:/user/list1";
				}
				
			} else {
				t.setRemark("修改失败");
				logService.add(t);
				return "error";
			}
		}
		// 注册用户
		@RequestMapping(value = "/add", method = RequestMethod.POST)
		public ModelAndView add(HttpServletRequest request) throws Exception {
			ModelAndView mv = new ModelAndView();
			request.setCharacterEncoding("utf-8");
			DzjUserCheck user = new DzjUserCheck();
			String username = request.getParameter("userName");
			System.out.println(username);
			String password = request.getParameter("userPWD");
			String name = request.getParameter("name");
			TLog t = new TLog();
			t.setEvent("用户注册");
			t.setLogCreater(username);
			t.setLogTime(new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss").format(new Date()));
			t.setLogtype("添加");
			t.setTablename("dzj_user_check");
			if (UserService.check(username)==0) {
				user.setName(name);
				user.setPassword(Md5Util.getMD5Str(password));
				user.setUsername(username);
				int res = UserCheckService.register(user);
				if (res==1) {
					request.setAttribute("zhuce","Success");
					System.out.println("注册成功");
					t.setRemark("注册成功");
				}
				else {
					request.setAttribute("zhuce","Error");
					System.out.println("注册失败");
					t.setRemark("注册失败");
				}
			}
			else {
				request.setAttribute("zhuce","repetition");
				System.out.println("用户名重复");
				t.setRemark("用户名重复");
			}
			logService.add(t);
			mv.setViewName("add");
			return mv;
		}
		// 列出所有的二级管理员人员信息
		@RequestMapping("/user2list")
		public String user2list(HttpServletRequest request, Model model) {
			TLog t = new TLog();
			t.setEvent("查询所有管理员信息");
			t.setLogCreater(request.getSession().getAttribute("username").toString());
			t.setLogTime(new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss").format(new Date()));
			t.setLogtype("查看");
			t.setTablename("dzj_user");
			try{
			HttpSession session = request.getSession();
			String depID = (String) session.getAttribute("DepID");
			
				List<DzjUser> list = UserService.getalladmin();
				System.out.println(list);
				List<DzjUserM> listm = new ArrayList<>();
				for (int i = 0; i < list.size(); i++) {
					DzjUserM dm = new DzjUserM();
					dm.setId(list.get(i).getId());
					dm.setName(list.get(i).getName());
					dm.setUsername(list.get(i).getUsername());
					dm.setConstantname(ConsService.id2rolename(list.get(i).getConstantid()).getRolename());
					listm.add(dm);
				}
				
				model.addAttribute("list", listm);
				t.setRemark("查看成功");
				logService.add(t);
				return "admin-permission";
			}
			catch(Exception e){
				t.setRemark("查看失败");
				logService.add(t);
				return "error";
			}
		}
		// 修改二级管理员前列出个人信息
				@RequestMapping("/secondedit")
				public ModelAndView secondedit(@RequestParam(value = "depID") String depID, Model model, HttpServletRequest request) {
					ModelAndView mv = new ModelAndView("edit1");
					
					DzjUser user = UserService.getuserbyid(Integer.parseInt(depID));
					
					List<DzjConstant> list = ConsService.getlist();
					System.out.println(list.size());
					mv.addObject("user", user);
					mv.addObject("list", list);
					ToDBLogBean bean = new ToDBLogBean(new Date(), "查询个人信息", (String)request.getSession().getAttribute("UserName"), "修改二级管理员前查询个人信息");
					logger.record(bean);
					return mv;
				}
				
		// 新增二级管理员权限信息
		@RequestMapping("/adduser2info")
		public void adduser2info(HttpServletRequest request
				,HttpServletResponse response
				,@RequestParam(value = "depID") String depID
				,@RequestParam(value = "authority") String authority) throws Exception {
			request.setCharacterEncoding("utf-8");
			DzjUser us = new DzjUser();
			us.setId(Integer.parseInt(depID));
			us.setConstantid(Integer.parseInt(authority));
					if (depID != null && authority != null) {
						
						
						if (UserService.updates(us)==1) {
							response.getWriter().print("success");
						}
						request.setAttribute("addSuccess", "Success");
						ToDBLogBean bean = new ToDBLogBean(new Date(), "新增权限",
								(String) request.getSession().getAttribute("username"), "新增二级管理员权限信息");
						logger.record(bean);
			}
		}
}
