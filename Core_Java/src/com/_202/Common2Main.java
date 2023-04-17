package com._202;

public class Common2Main {

	public static void main(String[] args) {
		Common2 c = new Common2();
		Common2 c1 = new Common2();
		
		Thread6 t1= new Thread6(c,"Aj");
		Thread7 t3= new Thread7(c1,"Roy");
		
		Thread t2= new Thread(t1);
		Thread t4= new Thread(t3);
		t2.start();
		try {
			t4.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t4.start();
		
		
	}

}
