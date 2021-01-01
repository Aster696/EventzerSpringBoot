package com.events_manager.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.events_manager.dao.UserDAO;
import com.events_manager.daoimpl.UserModelDetails;
import com.events_manager.model.UserModel;

@Component
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	UserDAO userDAO;
	
	@Transactional(readOnly = true)
//	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		UserModel emailAddr = userDAO.findUserByemail(email);
		UserBuilder builder = null;
		if(emailAddr!=null) {
			builder = User.withUsername(email);
			builder.disabled(!emailAddr.isStatus());
			builder.password(emailAddr.getPassword());
			String[] authorities = new String[] {emailAddr.getAuthority()};
			
			builder.authorities(authorities);
		}else {
			throw new UsernameNotFoundException("User does not exist");
		}
		return builder.build();
	}

}
