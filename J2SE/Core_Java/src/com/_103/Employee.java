package com._103;

public class Employee implements Comparable {
	
	private int id;
	private String name;
	private String post;
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String post, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.post = post;
		this.salary = salary;
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

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", post=" + post + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Employee e1= this;
		Employee e2= (Employee)o;
		if(e1.id>e2.getId()) {
			return +1;
		}
		else if(e1.id<e2.id) {
			return -1;
		}
		else {
			return 0;	
		}
		
	}
	
}
