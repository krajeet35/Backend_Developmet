package com._202;

public class Common {
	
	public synchronized void fun1(String name) {
		System.out.println("Welcome");
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(name);
	}
	

}
