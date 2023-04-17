package com._202;

public class Thread10 {
	
	public synchronized void funB(Thread9 t) {
		System.out.println("inside funB of thread10");
		t.fun1();
		System.out.println("end of funB");
	}
	
	public synchronized void fun2() {
		System.out.println("inside fun2");
	}

}
