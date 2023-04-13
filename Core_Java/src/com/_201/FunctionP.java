package com._201;

public class FunctionP {

	public static void main(String[] args) {
//		Using external class
		Funtionalntr i1= new Impl1();
		i1.sayHello("Ajeet");
		
//		Using Anonymous inner class
		Funtionalntr i2= new Funtionalntr() {
			
			@Override
			public void sayHello(String name) {
				System.out.println("inside FunctionaP class using Anonymous class");
				System.out.println("Hello "+name);
				
			}
		};
		i2.sayHello("Roy");
		
//		Using Lambda expression
		Funtionalntr i3= n-> System.out.println("Hello "+n);
		i3.sayHello("Ajeet roy");

	}

}
