package com._103;

import com._101.Student;

public class MainStudent {
	
	public static void main(String[] args) {
		Student[] s = new Student[2];
		s[0]= new Student(1, "Aj", "java");
		s[1]= new Student(2, "rh", "c#");
		System.out.println(s[0]);
		System.out.println(s[1]);
	}
	

}
