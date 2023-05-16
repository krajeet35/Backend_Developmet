package com.ajeet.collectionInjection;

public class Student {
	private int roll;
	private String name;
	private int marks;
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	public void display() {
		System.out.println("roll: "+roll);
		System.out.println("name: "+name);
		System.out.println("marks: "+marks);
	}

}
