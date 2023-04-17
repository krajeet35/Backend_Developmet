package com._202;

public class Thread9 {
	
	public synchronized void funA(Thread10 t) {
		System.out.println("inside funA of thread9");
		t.fun2();
	}
	
	
//	Remove synchronized keyword it will remove deadlock condition
	public synchronized void fun1() {
		System.out.println("inside fun1");
	}

}
