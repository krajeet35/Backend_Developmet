package com.ajeet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajeet.entities.Course;
import com.ajeet.exceptions.CourseException;
import com.ajeet.services.CourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {
	@Autowired
	private CourseService cService;
	
	@PostMapping("/register")
	public ResponseEntity<Course> registerNewCourseHandler(@RequestBody Course course) throws CourseException{
		Course c= cService.registerNewCourse(course);
		
		return new ResponseEntity<Course>(c, HttpStatus.OK);
	}
 
}
