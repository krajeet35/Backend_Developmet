package com.ajeet.services;

import org.springframework.stereotype.Service;

import com.ajeet.exceptions.CustomerException;
import com.ajeet.model.Customer;

@Service
public interface CustomerService {
	
	public Customer createCustomer(Customer customer) throws CustomerException;
	
	public Customer updateCustomer(Customer customer, String key) throws CustomerException;


}
