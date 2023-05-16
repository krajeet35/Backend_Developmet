package com._202;

public class Thread5 implements Runnable {
	
	int sum;

	public static void main(String[] args) throws InterruptedException {
		Thread5 t1 = new Thread5();
		Thread t2 = new Thread(t1);
		t2.start();
//		t2.sleep(1);
		t2.join(); 
		
		System.out.println("Total Sum: "+t1.sum);
		

	}

	@Override
	public void run() {
		for(int i=1;i<100;i++) {
			sum+=i;
		}
		
	}

}
