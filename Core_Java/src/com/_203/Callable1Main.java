package com._203;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Callable1Main {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Callable1[] work= {
				new Callable1(10),
				new Callable1(20),
				new Callable1(5),
				new Callable1(6),
				new Callable1(9)
		};
		
		ExecutorService pool1= Executors.newFixedThreadPool(3);
		
		for(Callable1 c:work) {
			Future<Integer> f=pool1.submit(c);
			int result=f.get();
			System.out.println(result);
			
		}
	}

}
