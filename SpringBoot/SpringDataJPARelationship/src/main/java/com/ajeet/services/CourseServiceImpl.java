package com.ajeet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajeet.entities.Course;
import com.ajeet.entities.Student;
import com.ajeet.exceptions.CourseException;
import com.ajeet.repositary.CourseRepo;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseRepo cRepo;

	@Override
	public Course registerNewCourse(Course course) throws CourseException {
		List<Student> students= course.getStudents();
		for(Student s: students) {
//			Associating each student with course
			s.getCourses().add(course);
		}
		return cRepo.save(course);
		
	}

}
