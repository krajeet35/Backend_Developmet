package com.ajeet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajeet.model.Address;
import com.ajeet.model.Teacher;

@Controller
@RestController
@RequestMapping("/teacher")
public class TeacherController {
	
	@RequestMapping("/getteacher")
	public Teacher getTeacher() {
		return new Teacher(5, "Ratan", 80000, new Address("Patna", "Bihar", "842001"));
	}

}
