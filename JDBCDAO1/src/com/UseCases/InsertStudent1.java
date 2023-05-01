package com.UseCases;

import java.util.Scanner;

import com.dao.StudentDaoImpl;

public class InsertStudent1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter roll: ");
		int roll= sc.nextInt();
		
		System.out.println("enter name: ");
		String name = sc.next();
		
		System.out.println("enter marks: ");
		int marks=sc.nextInt();
		
		StudentDaoImpl dao = new StudentDaoImpl();
		String result=dao.insertStudentDetails(roll, name, marks);
		
		System.out.println(result);
		
		sc.close();

	}

}
