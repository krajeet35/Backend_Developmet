package com.ajeet.controller;

import java.util.ArrayList;
import java.util.List;

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
	
	@RequestMapping("/list")
	public List<Student> studentList(){
		
		List<Student> ls= new ArrayList<>();
		ls.add(getStudent());
		ls.add(getStudent());
		ls.add(getStudent());
		ls.add(getStudent());
		ls.add(getStudent());
		
		return ls;
		
	}

}
