package com.ajeet.service;

import java.util.List;

import org.springframework.web.bind.MethodArgumentNotValidException;

import com.ajeet.entities.Student;
import com.ajeet.exceptions.StudentException;

public interface StudentService {
	
	public String registerStudent(Student s) throws MethodArgumentNotValidException;
	
	public Student getStudentByRoll(Integer roll) throws StudentException;
	
	public List<Student> getAllStudent() throws StudentException;
	
	public String deleteByRoll(Integer roll) throws StudentException;
	
	public Student updateStudentDetails(Student s) throws StudentException;

}
