package com.usecases;

import java.util.Scanner;

import com.dao.StudentDao;
import com.dao.StudentDaoImpl;


public class EnrollStudentInCourse {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		System.out.println("enter roll: ");
		int roll=s.nextInt();
		
		System.out.println("enter course cid: ");
		int cid=s.nextInt();
		
		StudentDao sd = new StudentDaoImpl();
		
		try {
			String result= sd.enrollStudentInCourse(roll, cid);
			
			System.out.println(result);
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
