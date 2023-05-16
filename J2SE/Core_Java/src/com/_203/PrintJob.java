package com._203;

public class PrintJob implements Runnable {
	String name;
	
	

	public PrintJob(String name) {
		super();
		this.name = name;
	}



	@Override
	public void run() {
		System.out.println(name+ " job strated by thread "+
	Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(name+ " job completed by thread "+
				Thread.currentThread().getName());
		
	}

}
