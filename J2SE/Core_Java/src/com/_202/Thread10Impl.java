package com._202;

public class Thread10Impl extends Thread {
	Thread9 t1;
	Thread10 t2;
	
	public Thread10Impl(Thread9 t1, Thread10 t2) {
		this.t1=t1;
		this.t2= t2;
	}
	
	@Override
	public void run() {
		t2.funB(t1);
	}

}
