package com._202;

public class Thread8Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread8 t1= new Thread8();
//		System.out.println(t1.sum);
		Thread t2= new Thread(t1);
		t2.start();
		
		Thread.sleep(2000);
//		t2.sleep(1000);
		
//		t2.join();
		synchronized (t1) {
			System.out.println("wait start");
			t1.wait(3000);;
			System.out.println("wait ends");
		}
		
		
		
		
		
		
		
		System.out.println(t1.sum);
	}

}
