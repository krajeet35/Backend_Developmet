package com._201;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class MyForEach  {
	 
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Aj", "ajeet","sjgdfh");
		names.forEach(s -> System.out.println(s.toUpperCase()));
		
		
		List<Student> students= new ArrayList<>();
		students.add(new Student(10, "shdgfer", 500));
		students.add(new Student(15, "shderegf",600));
		students.add(new Student(1, "sherdgf", 400));
		students.add(new Student(20, "efshdgf", 900));
		students.add(new Student(16, "kskshdgf", 700));
		students.add(new Student(18, "shdgfdf", 400));
		students.add(new Student(19, "shddfgf", 300));
		students.add(new Student(12, "khdshdgf", 900));
		
		students.forEach(s -> {
			System.out.println("Roll: "+s.getRoll());
			System.out.println("Name: "+s.getName());
			System.out.println("Marks: "+s.getMarks());
			System.out.println("=================");
		});
		
	}

}
