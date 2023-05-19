package com.ajeet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajeet.entities.Student;
import com.ajeet.exceptions.CourseException;
import com.ajeet.services.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private StudentService sService;
	
	@PostMapping("/registerStudent/{cname}")
	public ResponseEntity<Student> registerStudentInCourseHandler(@PathVariable("cname") String cname,@RequestBody Student student) throws CourseException{
	
		Student s=sService.registerStudentInCourse(cname, student);
		return new ResponseEntity<Student>(s, HttpStatus.OK);
	}

}
