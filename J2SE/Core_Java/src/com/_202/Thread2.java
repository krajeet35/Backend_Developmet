package com._202;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		System.out.println("Start of Thread2");
		for(int i=0;i<5;i++) {
			System.out.println("Inside Thread2: "+i);
		}
		System.out.println("End of Thread2");
		
	}

}
