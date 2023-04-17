package com._202;

public class Thread7 implements Runnable {
	Common2 c;
	
	

	@Override
	public void run() {
		
		c.fun1();
	}
	
	Thread7(Common2 c){
		this.c=c;
	}

	
	
	

}
