package com.events_manager.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.events_manager.model.UserModel;

@Component
public interface UserDAO extends CrudRepository<UserModel, Integer>{
	
	UserModel findUserByemail(String email);
	
}
