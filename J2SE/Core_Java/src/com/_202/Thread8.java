package com._202;

public class Thread8 implements Runnable {
	
	int sum=0;

	@Override
	public void run() {
		System.out.println("calculation start");
		synchronized (this) {
			for(int i=0;i<10;i++) {
				sum+=i;
			}
			System.out.println("notified");
			this.notify();
		}
		
		
	}

}
