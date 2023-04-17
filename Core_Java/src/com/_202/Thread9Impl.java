package com._202;

public class Thread9Impl extends Thread {
	Thread9 t1;
	Thread10 t2;
	
	public Thread9Impl(Thread9 t1, Thread10 t2) {
		this.t1=t1;
		this.t2= t2;
	}
	
	@Override
	public void run() {
		t1.funA(t2);
	}
	

}
