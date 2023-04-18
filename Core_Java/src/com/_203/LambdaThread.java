package com._203;

public class LambdaThread {
	
	
	public static void main(String[] args) {
		
		Thread tr1= new Thread(() -> System.out.println(
				"Using Lambda"));
		
		tr1.start();
		
		Thread tr2 = new Thread(new X()::fun1 );
		tr2.start();
		
		
		
	}
	
	

}
