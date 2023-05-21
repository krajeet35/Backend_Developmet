package com.ajeet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ajeet.exceptions.CustomerException;
import com.ajeet.model.Customer;
import com.ajeet.services.CustomerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	private CustomerService cService;
	
	@PostMapping("/save")
	public ResponseEntity<Customer> saveCustomerHandler(@Valid @RequestBody Customer customer) throws CustomerException{
		Customer c1= cService.createCustomer(customer);
		return new ResponseEntity<Customer>(c1, HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Customer> updateCustomerHandler(@Valid @RequestBody Customer customer, @RequestParam String key) throws CustomerException{
		Customer updatedCustomer= cService.updateCustomer(customer, key);
		return new ResponseEntity<Customer>(updatedCustomer, HttpStatus.OK);
	}

}
