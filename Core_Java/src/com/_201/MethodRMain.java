package com._201;

import java.util.Objects;

public class MethodRMain {
	
	public static void fun1(String str) {
		System.out.println("Welcome "+str);
		System.out.println("Inside fun1 of MethodRMain");
	}
	
	public void fun2(String str) {
		System.out.println("inside non-static MethodRMain");
	}
	public MethodRMain(String str) {
		// TODO Auto-generated constructor stub
		System.out.println("Inside constructor");
	}
	public MethodRMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Funtionalntr i1= MethodRMain::fun1;
		i1.sayHello("Aj");
		
		Funtionalntr i2= new MethodRMain() ::fun2;
		i2.sayHello("Aj");
		
		Funtionalntr i3= MethodRMain::new;
		i3.sayHello("Aj");

	}

}
