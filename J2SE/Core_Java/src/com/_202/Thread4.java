package com._202;

public class Thread4 implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		Thread4 t1= new Thread4();
		Thread t2= new Thread(t1);
		
		t2.start();
		System.out.println("Inside main");
		t2.sleep(2000);
		
		System.out.println("End of main");
		
		

	}

	@Override
	public void run() {
		System.out.println("Start of run");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End of run");
		
	}

}
