package com.ajeet.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ajeet.entities.Student;
import com.ajeet.exceptions.CourseException;
import com.ajeet.exceptions.StudentException;

@Service
public interface StudentService {
	
	public Student registerStudentInCourse(String cname, Student student) throws CourseException;
	
	public List<Student> findStudentByCname(String cname) throws CourseException;

}
