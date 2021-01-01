package com.events_manager.controller;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.events_manager.dao.EventDAO;
import com.events_manager.dao.UserDAO;
import com.events_manager.model.EventModel;
import com.events_manager.model.UserModel;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;

@Controller
@RequestMapping("/event")
public class EventController {

	
	@Autowired
	EventDAO eventDAO;
	
	@Autowired
	UserDAO userDAO;
	
	@GetMapping("/addEvent")
	public String addEvent(ModelMap map) {
		map.addAttribute("event", new EventModel());
		return "addEvent";
	}
	
	@PostMapping("/addEvent")
	public String addEvent(@ModelAttribute("event") EventModel event) {
//		UserModel um = new UserModel();
//		um.setId(um.getId());
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if(principal instanceof UserDetails) {
			UserDetails userDetail = ((UserDetails) principal);
			UserModel um = new UserModel();
			um = userDAO.findUserByemail(userDetail.getUsername());
			
			event.setUser(um);
		}
		eventDAO.save(event);
		return "redirect:/event/displayEvents";
	}
	
	@GetMapping("/displayEvents")
	public String displayEvents(ModelMap map) {
		List<EventModel> events = new ArrayList<EventModel>();
		for(EventModel em:eventDAO.findAll()) {
			events.add(em);
		}
		map.addAttribute("events", events);
		return "displayEvents";
	}
	
	@GetMapping("/displayEvents/{eventId}")
	public String displayEventById(@PathVariable("eventId") int eventId, ModelMap map) {
		Optional<EventModel> eve = (Optional<EventModel>)eventDAO.findById(eventId);
			EventModel ev = eve.get();
			map.addAttribute("ev", ev);
			return "displayEvent";
		
	}
	
	@RequestMapping("/deleteEvent/{eventId}")
	public String deleteEvent(@PathVariable("eventId") int eventId) {
		
			eventDAO.deleteById(eventId);
		
		return "redirect:/event/displayEvents";
		
	}
	
}
