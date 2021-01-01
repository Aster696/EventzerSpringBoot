package com.events_manager.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.events_manager.model.EventModel;
//Aster++++++++++++++++++++++++++++++++++++++++++++++++++++
@Component
public interface EventDAO extends CrudRepository<EventModel, Integer>{
	
}
