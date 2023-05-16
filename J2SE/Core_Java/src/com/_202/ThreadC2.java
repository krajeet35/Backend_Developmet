package com._202;

public class ThreadC2 extends Thread {
	Common c;
	String name;
	
	public ThreadC2(Common c, String name) {
		// TODO Auto-generated constructor stub
	   this.c=c;
	   this.name=name;
	
	}
	@Override
	public void run() {
		c.fun1(name);
	}

}
