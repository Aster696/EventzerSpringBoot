package com.events_manager.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.events_manager.dao.ManagerDAO;
import com.events_manager.model.ManagerModel;
import com.events_manager.model.UserModel;
import com.events_manager.service.ManagerService;

@Service
public class ManagerServiceImpl implements ManagerService{

	@Autowired
	ManagerDAO managerDAO;
	
	@Override
	public boolean addMyEvent(ManagerModel manager) {
		
		return managerDAO.addMyEvent(manager);
	}

	@Override
	public List<ManagerModel> diplayEventByUserId(UserModel user) {
		
		return managerDAO.diplayEventByUserId(user);
	}

	@Override
	public ManagerModel diplayMyEventId(int managerId) {
		
		return managerDAO.diplayMyEventId(managerId);
	}

}
