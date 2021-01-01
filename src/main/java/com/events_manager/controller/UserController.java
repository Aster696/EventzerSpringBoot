package com.events_manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.events_manager.dao.UserDAO;
import com.events_manager.model.UserModel;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	UserDAO userDAO;
	
	@GetMapping("/signin")
	public String Signin(ModelMap map) {
		
		map.addAttribute("user", new UserModel());
		return "register";
	}
	
	@PostMapping("/signin")
	public String addUser(@ModelAttribute("user") UserModel user) {
		user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
		user.setAuthority("USER");
		user.setStatus(true);
		userDAO.save(user);
		return "redirect:/user/login";
	}
	
	@RequestMapping("/login")
	public String Login() {
		return "login";
	}
	
}
