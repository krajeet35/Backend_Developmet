package com.ajeet.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajeet.entities.Course;
import com.ajeet.entities.Student;
import com.ajeet.exceptions.CourseException;
import com.ajeet.exceptions.StudentException;
import com.ajeet.repositary.CourseRepo;
import com.ajeet.repositary.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepo sRepo;
	
	@Autowired
	private CourseRepo cRepo;

	@Override
	public Student registerStudentInCourse(String cname, Student student) throws CourseException {
		Course course= cRepo.findBycname(cname);
		if(course != null) {
			
			student.getCourses().add(course);
			course.getStudents().add(student);
			return sRepo.save(student);
		}
		else {
			throw new CourseException("Course not found with cname: "+cname);
		}
	}

}
