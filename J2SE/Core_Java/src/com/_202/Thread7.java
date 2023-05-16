package com._202;

public class Thread7 implements Runnable {
	Common2 c;
	String name;
	

	@Override
	public void run() {
		
		c.fun1(name);
	}
	
	Thread7(Common2 c, String name){
		this.c=c;
		this.name= name;
	}

	
	
	

}
