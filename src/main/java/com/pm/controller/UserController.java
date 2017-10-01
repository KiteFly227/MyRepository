package com.pm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/userlogin.do")
	public ModelAndView userLogin(@RequestParam()String admin, @RequestParam() String password) {
		ModelAndView mav = new ModelAndView();
		
		if (userService.selectUserByAdmin(admin, password)) {
			System.out.println("success");
			mav.setViewName("index");
			return mav;
		}
		System.out.println("faile");
		mav.setViewName("login");
		return mav;
		
	}
	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView("login");
		
		return mav;
	}
}
