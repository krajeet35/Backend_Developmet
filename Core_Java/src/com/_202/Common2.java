package com._202;

public class Common2 {
	void fun1(String name) {
		System.out.println("Inside fun1 "+name);
		
		
		synchronized (Common2.class) {
			System.out.println("Inside synchronized block "+name);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("End of fun1 "+name);
	}

}
