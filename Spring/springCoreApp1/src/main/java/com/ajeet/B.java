package com.ajeet;

public class B {
	
	private A a;

	public B(A a) {
		super();
		this.a = a;
	}
	
	public void funB() {
		System.out.println("inside funB of B");
		System.out.println("A object: "+a);
	}

}
