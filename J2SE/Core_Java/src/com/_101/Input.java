package com._101;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=0;
		System.out.println("Enter the number of Student data you want to add");
		try {
			 n= sc.nextInt();	
		}
		catch(Exception e){
			System.out.println("Please enter valid input");
		}
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter roll no.");
			int roll= sc.nextInt();
			sc.nextLine();
			System.out.println("Enter name");
			String name= sc.nextLine();
//			sc.nextLine();
			System.out.println("Enter course name");
			String course= sc.nextLine();

			Student s= new Student(roll, name, course);
			System.out.println(s.toString());
			System.out.println("=========================");
		}
	
	}

}
