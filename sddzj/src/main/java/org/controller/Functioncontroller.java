package org.controller;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.model.Itemmodel;
import org.pojo.DzjFunction;
import org.pojo.DzjUser;
import org.pojo.TLog;
import org.service.IConstantService;
import org.service.IFuncService;
import org.service.ILogService;
import org.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.tools.DzjResult;

@Controller
@RequestMapping("/function")
public class Functioncontroller {
	
	@Autowired private IFuncService FuncService;
	@Autowired private IConstantService consService;
	@Autowired private IUserService UserService;
	@Autowired private ILogService logService;
	@RequestMapping(value = "/getitem", method = RequestMethod.POST)
	@ResponseBody
	public ModelAndView getitem(
			HttpServletRequest request,
			HttpServletResponse response,
			@RequestParam(value = "username") String username,
			@RequestParam(value = "password") String password,
		    HttpSession session) throws UnsupportedEncodingException {
		ModelAndView view = new ModelAndView();
		Cookie cookie_token=new Cookie("token","666");
		cookie_token.setMaxAge(600);  
		response.addCookie(cookie_token); 
		request.setCharacterEncoding("utf-8");
		List<Itemmodel> mItem = new ArrayList<Itemmodel>();
		DzjResult result = new DzjResult();
		DzjUser results = UserService.login(username, password);
		TLog t = new TLog();
		t.setEvent("用户登录");
		t.setLogCreater(username);
		t.setLogTime(new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss").format(new Date()));
		t.setLogtype("查询");
		t.setTablename("dzj_user,dzj_function");
		if ( results!=null) {
			session.setAttribute("userpower", consService.getpower(results.getConstantid()));
			session.setAttribute("user_name", results.getName());
			session.setAttribute("username", username);
		
		
		List<DzjFunction> list = FuncService.getitem(Integer.parseInt(session.getAttribute("userpower").toString()));
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getLevel()==1) {
				//父
				Itemmodel item = new Itemmodel();
				item.setFuncname(list.get(i).getFuncname());
				item.setFuncicon(list.get(i).getFuncicon());
				item.setFuncpath(list.get(i).getFuncpath());
				item.setChildflag(1);
				//有子节点
				if (list.get(i).getFuncchild()!=null) {
					List<Itemmodel> chileit = new ArrayList<Itemmodel>();
					//有一个子节点
					if (list.get(i).getFuncchild().indexOf(" ")==-1) {
						System.out.println("一个子节点");
						for (int j1 = 0; j1 < list.size(); j1++) {
							if (list.get(j1).getId()==Integer.parseInt(list.get(i).getFuncchild())) {
								Itemmodel items = new Itemmodel();
								items.setFuncicon(list.get(j1).getFuncicon());
								items.setFuncname(list.get(j1).getFuncname());
								items.setFuncpath(list.get(j1).getFuncpath());
								items.setId(list.get(j1).getId());
								chileit.add(items);
								break;
							}
						}
						item.setChild(chileit);
					}//有超过一个子节点
					else {
						System.out.println("子节点:"+list.get(i).getFuncchild());
					String[] x = list.get(i).getFuncchild().split(" ");
					System.out.println("xsize:"+x.length);
					
					for (int j = 0; j < x.length; j++) {
						for (int j1 = 0; j1 < list.size(); j1++) {
							if (list.get(j1).getId()==Integer.parseInt(x[j])) {
								Itemmodel items = new Itemmodel();
								items.setFuncicon(list.get(j1).getFuncicon());
								items.setFuncname(list.get(j1).getFuncname());
								items.setFuncpath(list.get(j1).getFuncpath());
								items.setId(list.get(j1).getId());
								chileit.add(items);
								break;
							}
						}
					}
					
					item.setChild(chileit);
					}
					
				}
				//无子节点
				else {
					item.setChildflag(0);	
					item.setFuncicon(list.get(i).getFuncicon());
					item.setFuncname(list.get(i).getFuncname());
					item.setFuncpath(list.get(i).getFuncpath());
					item.setId(list.get(i).getId());
				}
				mItem.add(item);
			}
		}
		
		session.setAttribute("lists", mItem);
		System.out.println("m size:"+session.getAttribute("lists").toString());
		view.addObject("itemlist", mItem);
		view.addObject("usr", results);
		view.setViewName("admin_index");
		t.setRemark("登录成功");
		logService.add(t);
		return view;
		}else{
			request.setAttribute("error", "loginerror");
			t.setRemark("登录失败");
			logService.add(t);
			return new ModelAndView("login");
		}
	}
	
	/**
	 * 修改功能目录权重
	 * @return
	 */
	@RequestMapping(value = "/getlist", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView getlist(
			HttpServletRequest request,
			HttpServletResponse response,
		    HttpSession session) throws UnsupportedEncodingException {
		List<DzjFunction> func = FuncService.getlist();
		ModelAndView view = new ModelAndView();
		view.addObject("funclist",func);
		view.addObject("rolelist", consService.getlist());
		view.setViewName("itempower");
			return view;
	}
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping(value = "/getroe", method = RequestMethod.POST)
	
	public @ResponseBody Map<String, String> getrole(
			@RequestParam(value = "funcid") String funcid,
			HttpServletRequest request,
			HttpServletResponse response,
		    HttpSession session) throws UnsupportedEncodingException {
			int power = FuncService.getpower(Integer.parseInt(funcid));
			Map<String, String> map = new HashMap<>();
			map.put("roe", consService.getrolelist(power));
			return map;
	}
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	
	public @ResponseBody Map<String, String> up(
			@RequestParam(value = "func") String func,
			@RequestParam(value = "role") String role,
			HttpServletRequest request,
			HttpServletResponse response,
		    HttpSession session){
			TLog log = new TLog();
			log.setEvent("修改功能权限");
			log.setLogCreater(request.getSession().getAttribute("username").toString());
			log.setLogTime(new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss").format(new Date()));
			log.setLogtype("修改");
			log.setTablename("dzj_function");
			DzjFunction f = new DzjFunction();
			f.setId(Integer.parseInt(func));
			f.setFuncpower(Integer.parseInt(role));
			int ret = FuncService.updatepower(f);
			Map<String, String> map = new HashMap<>();
			if (ret ==1 ) {
				log.setRemark("修改成功");
				map.put("ret", "success");
			}else {
				log.setRemark("修改失败");
				map.put("ret", "error");
			}
			logService.add(log);
			return map;
	}
}
