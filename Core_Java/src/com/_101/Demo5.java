package com._101;

public class Demo5 {
	int a=20;
	
	{
//		System.out.println(++a);
	}

	public static void main(String[] args) {
		Demo5 d1= new Demo5();
		d1.a+=100;
		System.out.println(d1.a);
		d1=null;
		System.out.println(d1);
		
		Demo5 d2= new Demo5();
		System.out.println(d2.a);
		
		int x=11;
		if(x%5==0 && x%3==0) {
			System.out.println("Hello Welcome");
		}
		else if(x%3==0) {
			System.out.println("Welcome");
		}
		else if(x%5==0) {
			System.out.println("Hello");
		}
		else {
			System.out.println("Invalid number");
		}

	}

}
