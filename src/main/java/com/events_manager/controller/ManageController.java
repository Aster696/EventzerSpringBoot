package com.events_manager.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.events_manager.dao.EventDAO;
import com.events_manager.dao.ManagerDAO;
import com.events_manager.dao.UserDAO;
import com.events_manager.model.EventModel;
import com.events_manager.model.ManagerModel;
import com.events_manager.model.UserModel;

@Controller
@RequestMapping("/manage")
public class ManageController {

	@Autowired
	UserDAO userDAO;
	
	@Autowired
	EventDAO eventDAO;
	
	@Autowired
	ManagerDAO managerDAO;
	
	@GetMapping("/myEvent")
	public String myEvent() {
		return "myEvent";
	}
	
	@GetMapping("/subEvent")
	public String subEvent() {
		return "subscribe";
	}
	
}
