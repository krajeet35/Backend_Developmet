package com.ajeet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajeet.model.Address;
import com.ajeet.model.Student;

@Controller
@RestController
public class MyController {
	
	@RequestMapping("/student")
	public Student getStudent() {
		
		Student s= new Student(1, "Ajeet", 500, new Address("Muzaffarpur", "Bihar", "560060"));
		
		return s;
	}

}
