package com.ajeet.model;

public class Student {
	

	private Integer roll;
	private String name;
	private Integer marks;
	
	private Address add;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(Integer roll, String name, Integer marks, Address add) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.add = add;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", add=" + add + "]";
	}

	public Integer getRoll() {
		return roll;
	}

	public void setRoll(Integer roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	

}
