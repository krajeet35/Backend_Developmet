package com.ajeet.lifeCycle;

public class A2 {
	int age;
	String name;
	
	public void setUp() {
		System.out.println("inside setUp method");
		System.out.println("age: "+age+" name: "+name);
	}
	
	public void destroy() {
		System.out.println("inside destroy method");
	}
	
	public void setAge(int age) {
		this.age = age;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void funA2() {
		System.out.println("inside funA2 of A2");
	}

}
