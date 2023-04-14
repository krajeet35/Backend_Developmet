package com._201;

import java.util.function.Consumer;

public class ConsumerMain {

	public static void main(String[] args) {
		
		Consumer<String> c1= new Consumer1();
		c1.accept("AJeet");
		
		Consumer<String> c2 = s -> System.out.println("Lambda: "+s);
		c2.accept("Roy");
		
		Consumer<Student> c3 = s -> {
			System.out.println(s.getRoll());
			System.out.println(s.getName());
			System.out.println(s.getMarks());
		};
		
		c3.accept(new Student(10, "Chanchal", 1000));

	}

}
