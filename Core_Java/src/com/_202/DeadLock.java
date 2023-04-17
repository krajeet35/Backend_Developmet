package com._202;

public class DeadLock {
	
	
	public static void main(String[] args) {
		
		Thread9 t1 = new Thread9();
		Thread10 t2= new Thread10();
		
		Thread9Impl t3= new Thread9Impl(t1, t2);
		Thread10Impl t4= new Thread10Impl(t1, t2);
		
		t3.start();
		t4.start();
		
		
		
		
	}
	
	
	
	

}
