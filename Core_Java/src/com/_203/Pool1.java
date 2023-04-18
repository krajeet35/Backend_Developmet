package com._203;

public class Pool1 {
	
	public static void main(String[] args) {
		
		Runnable task= () -> System.out.println(
				"Welcome");
		
		Thread t1= new Thread(task);
		
		t1.start();
	}

}
