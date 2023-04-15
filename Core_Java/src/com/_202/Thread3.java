package com._202;

public class Thread3 implements Runnable {

	public static void main(String[] args) {
		String name= Thread.currentThread().getName();
		System.out.println(name);
		Thread.currentThread().setName("Ajeet");
		String name1= Thread.currentThread().getName();
		System.out.println(name1);
		
		Thread3 t1 = new Thread3();
		Thread t2= new Thread(t1);
		t2.setName("Roy");
		
//		Thread3 t1 = new Thread3();
		Thread t3= new Thread(t1);
		t3.setName("Kumar");
		
		t3.setPriority(1);
		t2.setPriority(10);
		
		t3.start();
		t2.start();
		
		
		System.out.println(t3.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(Thread.currentThread().getPriority()+ " "+ Thread.currentThread().getName());
		

	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Inside run");
		
	}

}
