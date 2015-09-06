package net.nadisa.anan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.nadisa.anan.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/login")
	public ModelAndView login() {
		System.out.println("UserController : login");
		ModelAndView modelAndView = new ModelAndView("/user/login");
		return modelAndView;
	}
	
	@RequestMapping(value = "/authenticate")
	public ModelAndView authenticate() {
		System.out.println("UserController : authenticate");
		ModelAndView modelAndView = new ModelAndView("/user/home");
		userService.authenticate();
		return modelAndView;
	}

}
