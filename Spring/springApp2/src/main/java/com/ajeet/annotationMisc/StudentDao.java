package com.ajeet.annotationMisc;

import java.util.List;

public interface StudentDao {
	
	public String insertStudent(Student s);
	
	public List<Student> getAll();

}
