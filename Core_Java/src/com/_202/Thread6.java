package com._202;

public class Thread6 implements Runnable {
	Common2 c;
	
	

	@Override
	public void run() {
		
		c.fun1();
	}
	
	Thread6(Common2 c){
		this.c=c;
	}

	
	
	

}
