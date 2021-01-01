package com.events_manager.daoimpl;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.events_manager.dao.ManagerDAO;
import com.events_manager.model.ManagerModel;
import com.events_manager.model.UserModel;

@Transactional
@Repository(value = "managerDAO")
public class ManagerDAOImpl implements ManagerDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public boolean addMyEvent(ManagerModel manager) {
		sessionFactory.getCurrentSession().save(manager);
		return true;
	}

	
	@Override
	public List<ManagerModel> diplayEventByUserId(UserModel user) {
		Query query = sessionFactory.getCurrentSession().createQuery("from com.events_manager.model.ManagerModel where user_id=:user_id");
		return query.setParameter("user_id", user.getId()).getResultList();
	}

	@Override
	public ManagerModel diplayMyEventId(int managerId) {
		Query query = sessionFactory.getCurrentSession().createQuery("form com.events_manager.model.ManagerModel where managerId=:managerid");
		query.setParameter("managerId", managerId);
		return (ManagerModel)query.getResultList().get(0);
	}

}
