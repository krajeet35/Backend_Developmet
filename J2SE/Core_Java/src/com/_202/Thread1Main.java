package com._202;

public class Thread1Main extends Thread {
	
	@Override
	public void run() {
		System.out.println("Start of run");
		for(int i=0;i<5;i++) {
			System.out.println("Inside run "+i);
		}
		System.out.println("End of run");
	}
	

	public static void main(String[] args) {
		
		Thread1Main t2= new Thread1Main();
		t2.start();
		
		MultiThread1 t1= new MultiThread1();
		t1.start();;
		
		System.out.println("Start of Main");
		for(int i=0;i<5;i++) {
			System.out.println("Inside Main "+i);
		}
		System.out.println("End of Main");
		
		
		
		
		
	}

}
