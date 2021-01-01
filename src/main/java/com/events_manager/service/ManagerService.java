package com.events_manager.service;

import java.util.List;

import com.events_manager.model.ManagerModel;
import com.events_manager.model.UserModel;

public interface ManagerService {

	public boolean addMyEvent(ManagerModel manager);
	public List<ManagerModel> diplayEventByUserId(UserModel user);
	public ManagerModel diplayMyEventId(int managerId);
	
}
