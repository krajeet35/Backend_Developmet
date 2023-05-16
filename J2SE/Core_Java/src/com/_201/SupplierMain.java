package com._201;

import java.util.function.Supplier;

public class SupplierMain {
	
	public static int getNumber() {
		
		return 1;
	}

	public static void main(String[] args) {
		Supplier<String> s1= new Supplier1();
		
		String str=s1.get();
		System.out.println(str);
		
		
		Supplier<String> s2 = () -> "From Lambda";
		System.out.println(s2.get());
		
		Supplier<Student> s3 =() -> new Student(1,"Ajeet",600);
		
		System.out.println(s3.get());
		
		Supplier<Integer> s4 =SupplierMain::getNumber;
		
		System.out.println(s4.get());
		
		
	}

}
