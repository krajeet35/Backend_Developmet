package com.ajeet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class MyController {
	
	@RequestMapping("/welcome")
	
	public String welcome() {
		return "Welcome to SpringBoot";
	}
	
	@RequestMapping("/student")
	public Student getStudent() {
		
		return new Student(1,"Ajeet",500);
	}
	
//	request
//	http://localhost:8080/welcome

}
