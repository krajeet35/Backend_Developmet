package com.ajeet.services;

import java.time.LocalDateTime;
import java.util.Optional;


import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajeet.dao.CustomerDao;
import com.ajeet.dao.SessionDao;
import com.ajeet.exceptions.LoginException;
import com.ajeet.model.CurrentUserSession;
import com.ajeet.model.Customer;
import com.ajeet.model.LoginDTO;
@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private CustomerDao cDao;
	
	@Autowired
	private SessionDao sDao;

	@Override
	public String logIn(LoginDTO dto) throws LoginException {
		Customer user= cDao.findByMobileNo(dto.getMobileNo());
		
		if(user== null) {
			throw new LoginException("Mobile number not registered..");
		}
		Optional<CurrentUserSession> currentUser= sDao.findById(user.getCustomerId());
		if(currentUser.isPresent()) {
			throw new LoginException("User already loggedIn...");
		}
		if(user.getPassword().equals(dto.getPassword())) {
			String key= RandomStringUtils.random(6,String.valueOf(System.currentTimeMillis()));
			
			CurrentUserSession cus= new CurrentUserSession(user.getCustomerId(), key, LocalDateTime.now());
			sDao.save(cus);
			return cus.toString();
		}
		else {
			throw new LoginException("Enter a valid password");
		}
	}

	@Override
	public String logOut(String key) throws LoginException {
		CurrentUserSession user= sDao.findByUuid(key);
		if(user==null) {
			throw new LoginException("User not loggedIn..");
		}
		else {
			sDao.delete(user);
			return "Logged out Successfully..";
		}
	}

}
