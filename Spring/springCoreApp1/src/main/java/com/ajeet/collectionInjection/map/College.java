package com.ajeet.collectionInjection.map;

import java.util.List;

public class College {
	private List<Student> students;
	
	private String collegeName;

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public College(String collegeName) {
		super();
		this.collegeName = collegeName;
	}

	public List<Student> getStudents() {
		return students;
	}

	public String getCollegeName() {
		return collegeName;
	}
	
	

}
