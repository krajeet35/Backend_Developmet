package com.UseCases;

import java.util.Scanner;

import com.dao.StudentDao;
import com.dao.StudentDaoImpl;

public class GetMarks {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter roll: ");
		int roll= sc.nextInt();
		
		StudentDao sd= new StudentDaoImpl();
		
		int marks=sd.getMarksByRoll(roll);
		
		if(marks>=0) {
			System.out.println("Marks is "+marks);
		}
		else {
			System.out.println("Student not exist with roll "+roll);
		}
		
		
		
		sc.close();
		

	}

}
