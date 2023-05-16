package com.ajeet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ajeet.model.Address;
import com.ajeet.model.Student;

@Controller
@RestController
@RequestMapping("/student")
public class StudentController {
	
//	PathVariable
	@RequestMapping("/get/{roll}")
	public Student get(@PathVariable("roll") Integer roll) {
		
		Student s= new Student(20, "Ajeet", 450,new Address("Kengeri", "Bangalore", "560060"));
		
		return s;
	}
	@RequestMapping("/get2/{roll}/{name}")
	public Student get2(@PathVariable("roll") Integer roll, @PathVariable("name") String name) {
		
		Student s= new Student(20, "Ajeet", 450,new Address("Kengeri", "Bangalore", "560060"));
		
		return s;
	}
	
// Request parameter
	@GetMapping("/get3")
	public Student get3(@RequestParam(value="roll", required=false) Integer roll) {
		
		Student s= new Student(25, "Ajeet", 450,new Address("Kengeri", "Bangalore", "560060"));
		
		return s;
	}
	
	@GetMapping("/get4")
	public Student get4(@RequestParam("roll") Integer roll, @RequestParam("name") String name) {
		
		Student s= new Student(35, "Ajeet", 450,new Address("Kengeri", "Bangalore", "560060"));
		
		return s;
	}

}
