package com._203;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Pool1 {

	public static void main(String[] args) {

		Runnable task = () -> System.out.println("Welcome");

		Thread t1 = new Thread(task);

//		t1.start();
		
		ExecutorService pool1= Executors.newFixedThreadPool(3);
		
		
		PrintJob[] work = {
				new PrintJob("Ajeet"),
				new PrintJob("Rakesh"),
				new PrintJob("Ravi"),
				new PrintJob("mukesh"),
				new PrintJob("Aman"),
				new PrintJob("jyoti")
				
		};
		for(PrintJob p:work) {
			pool1.submit(p);
		}
		
		pool1.shutdown();
		
		
	}

}
