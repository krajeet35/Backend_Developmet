package com._101;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Ajeet roy";
		int a=25;
		Name(name);
		Methods m1= new Methods();
		m1.age(a);

	}
	
	static void Name(String n) {
		System.out.println("The name is "+n);
	}
	void age(int a) {
		System.out.println("The age is "+a);
	}

}
