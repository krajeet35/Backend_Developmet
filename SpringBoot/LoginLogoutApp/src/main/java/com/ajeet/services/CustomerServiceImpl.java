package com.ajeet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajeet.dao.CustomerDao;
import com.ajeet.dao.SessionDao;
import com.ajeet.exceptions.CustomerException;
import com.ajeet.model.CurrentUserSession;
import com.ajeet.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao cDao;
	
	@Autowired
	private SessionDao sDao;

	@Override
	public Customer createCustomer(Customer customer) throws CustomerException {
		Customer exist= cDao.findByMobileNo(customer.getMobileNo());
		
		if(exist != null) {
			throw new CustomerException("Mobile number already registered");
		}
		else {
			return cDao.save(customer);
		}
	}

	@Override
	public Customer updateCustomer(Customer customer, String key) throws CustomerException {
		CurrentUserSession user= sDao.findByUuid(key);
		if(user==null) {
			throw new CustomerException("Please provide a valid key to update customer");
		}
		if(user.getUserId()==customer.getCustomerId()) {
			return cDao.save(customer);
		}
		else {
			throw new CustomerException("Please login first...");
		}
	}

}
