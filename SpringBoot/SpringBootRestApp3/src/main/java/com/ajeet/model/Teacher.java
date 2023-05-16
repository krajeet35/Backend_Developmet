package com.ajeet.model;

public class Teacher {
	private int id;
	private String name;
	private int salary;
	
	private Address add;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(int id, String name, int salary, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.add = add;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}
	

}
