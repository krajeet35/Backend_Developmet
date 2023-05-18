package com.ajeet.service;

import java.util.List;

import org.springframework.web.bind.MethodArgumentNotValidException;

import com.ajeet.entities.Student;
import com.ajeet.entities.StudentDTO;
import com.ajeet.exceptions.StudentException;

public interface StudentService {
	
	public String registerStudent(Student s) throws MethodArgumentNotValidException;
	
	public Student getStudentByRoll(Integer roll) throws StudentException;
	
	public List<Student> getAllStudent() throws StudentException;
	
	public String deleteByRoll(Integer roll) throws StudentException;
	
	public Student updateStudentDetails(Student s) throws StudentException;
	
	public Student updateStudentMarks(Integer roll, Integer grace) throws StudentException;
	
	public List<Student> getStudentByMarks(Integer marks) throws StudentException;
	
	public String getStudentNameByRoll(Integer roll) throws StudentException;
	
	public List<String> getNameAndRollByMarks(Integer marks) throws StudentException;
	
	public List<StudentDTO> getNameAndMarksByMarks(Integer marks) throws StudentException;
	

}
