package org.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/page")
public class Pagecontroller {
//	@RequestMapping("/login")
//	public String login(){
//		return "login";
//	}
	
	@RequestMapping("/{pg}")
	public ModelAndView if_home(@PathVariable("pg")String pg,HttpSession session){
		ModelAndView mv = new ModelAndView();
		mv.addObject("usernames", session.getAttribute("username"));
		System.out.println("pg:"+session.getAttribute("username"));
		mv.setViewName(pg.toString());
		return mv;
	}
	
//	@RequestMapping("/index")
//	public String index(){
//		return "admin_index";
//	}
}
