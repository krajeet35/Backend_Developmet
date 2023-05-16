package com.jdbc101;

public class A {
	
//	Non-static block
	{
		System.out.println("inside non-static block");
	}
//	static block
	static {
		System.out.println("inside static block");
	}
	
	
	public void funA() {
		System.out.println("inside funA of A");
	}
	
	public A() {
		// TODO Auto-generated constructor stub
		System.out.println("inside constructor of A");
	}
	
	public static void main(String[] args) {
		
		System.out.println("inside main method");
		
		A a1= new A();
		a1.funA();
		A a2= new A();
	}

}
