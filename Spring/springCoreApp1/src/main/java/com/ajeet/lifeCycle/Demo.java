package com.ajeet.lifeCycle;

public class Demo {
	
	public Demo() {
		// TODO Auto-generated constructor stub
		System.out.println("Object created....");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("object destroyed...");
	}

	public static void main(String[] args) {
		Demo d= new Demo();
		
		d=null;
		
//		Method to invoke the garbage collector
		System.gc();

	}

}
