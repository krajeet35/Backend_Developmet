package com._202;

public class Thread2Main implements Runnable {

	public static void main(String[] args) {
		
		Thread2 t1= new Thread2();
		Thread t2= new Thread(t1);
		Thread2Main t3 = new Thread2Main();
		Thread t4 = new Thread(t3);
		t4.start();
		t2.start();
		
		
		System.out.println("Main Starts");
		for(int i=10;i<15;i++) {
			System.out.println("Inside Main: "+i);
		}
		System.out.println("End of Main");
		

	}

	@Override
	public void run() {
		System.out.println("Start of Thread2Main");
		for(int i=0;i<5;i++) {
			System.out.println("Inside Thread2Main: "+i);
		}
		System.out.println("End of Thread2Main");
		
	}

}
