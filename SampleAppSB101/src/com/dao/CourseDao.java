package com.dao;

import java.util.List;

import com.exceptions.CourseException;
import com.exceptions.Student_CourseException;
import com.model.Course;
import com.model.Student;
import com.model.Student_Course;

public interface CourseDao {
	
	public String registerCourse(Course course) throws CourseException;
	
	public List<Student_Course> getAllStudentsByCourseName(String cname) throws Student_CourseException;
	

}
