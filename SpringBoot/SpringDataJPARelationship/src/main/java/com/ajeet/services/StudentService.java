package com.ajeet.services;

import org.springframework.stereotype.Service;

import com.ajeet.entities.Student;
import com.ajeet.exceptions.CourseException;
import com.ajeet.exceptions.StudentException;

@Service
public interface StudentService {
	
	public Student registerStudentInCourse(String cname, Student student) throws CourseException;
	

}
