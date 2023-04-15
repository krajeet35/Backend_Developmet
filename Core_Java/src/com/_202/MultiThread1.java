package com._202;

public class MultiThread1 extends Thread {

	@Override
	public void run() {
		System.out.println("Start of MultiThread1");
		for(int i=0;i<5;i++) {
		System.out.println("Inside MultiThread1: "+i);
		}
		System.out.println("End of MultiThread1");
		
	}

}
