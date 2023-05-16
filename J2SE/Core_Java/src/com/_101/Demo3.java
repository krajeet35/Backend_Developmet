package com._101;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyDemo d1= new MyDemo();
		System.out.println("inside Demo3");
		MyDemo.main(args);
		
	}

}

class MyDemo{
	
	public static void main(String[] args) {
		System.out.println("Hello Dear");
		Demo3.main(args);
	}
}
