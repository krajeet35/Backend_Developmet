package com.ajeet.services;

import org.springframework.stereotype.Service;

import com.ajeet.entities.Course;
import com.ajeet.exceptions.CourseException;

@Service
public interface CourseService {
	
	public Course registerNewCourse(Course course) throws CourseException;


}
