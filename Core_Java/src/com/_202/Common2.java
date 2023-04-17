package com._202;

public class Common2 {
	void fun1() {
		System.out.println("Inside fun1");
		
		
		synchronized (Common2.class) {
			System.out.println("Inside synchronized block of fun1");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("End of fun1");
	}

}
