package com.ajeet;

public class A {
	
	private B b;

	
	
	public void setB(B b) {
		this.b = b;
	}



	public void funA() {
		System.out.println("inside funA of A");
		System.out.println("B object: "+b);
	}
	

}
