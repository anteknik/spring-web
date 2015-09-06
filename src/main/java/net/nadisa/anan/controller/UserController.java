package net.nadisa.anan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.nadisa.anan.dao.UserDao;
import net.nadisa.anan.model.Employee;
import net.nadisa.anan.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	UserService userService;
	
	@Autowired
	UserDao service;
	
	@RequestMapping(value = "/login")
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView("/user/login");
		return modelAndView;
	}
	
	@RequestMapping(value = "/authenticate")
	public ModelAndView authenticate() {
		ModelAndView modelAndView = new ModelAndView("/user/home");
		userService.authenticate();
		return modelAndView;
	}
	
	@RequestMapping(value = "/add")
	public ModelAndView tambahData() {
		//ModelAndView modelAndView = new ModelAndView("/user/add");
		ModelAndView modelAndView = new ModelAndView("redirect:/user/list");
		modelAndView.addObject("msg", service.save(new Employee("anton", "nadisa")));
		userService.authenticate();
		return modelAndView;
	}
	
	@RequestMapping("/list")
	public ModelAndView userList() {
		ModelAndView modelAndView = new ModelAndView("/user/list");
		modelAndView.addObject("users", userService.userList());
		return modelAndView;
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView editUser(@PathVariable Long id) {
		//ModelAndView modelAndView = new ModelAndView("/user/add");
		ModelAndView modelAndView = new ModelAndView("redirect:/user/list");
		modelAndView.addObject("userForm", userService.findUser(id));
		return modelAndView;
	}
	
	@RequestMapping("/delete/{id}")
	public ModelAndView deleteUser(@PathVariable Long id) {
		ModelAndView modelAndView = new ModelAndView("redirect:/user/list");
		userService.deleteUser(id);
		return modelAndView;
	}

}
