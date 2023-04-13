package com._201;

public class Lambda1 {

	public static void main(String[] args) {
		Funtionalntr i1= (String n)->{
			System.out.println("Hello "+n);
			System.out.println("You will succeed");
		};
		i1.sayHello("Roy");
		
		Funtionalntr i2 = n -> System.out.println("Welcome "+n);
		
		i2.sayHello("Aj");

	}

}
