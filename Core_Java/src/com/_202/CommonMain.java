package com._202;

public class CommonMain {

	public static void main(String[] args) {
		Common c1= new Common();
		ThreadC1 t1= new ThreadC1(c1,"Ajeet");
		ThreadC2 t2= new ThreadC2(c1,"Roy");
		
		t1.start();
		t2.start();
		

	}

}
