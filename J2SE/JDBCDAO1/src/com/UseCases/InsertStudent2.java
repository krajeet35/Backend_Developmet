package com.UseCases;

import java.util.Scanner;

import com.dao.StudentDao;
import com.dao.StudentDaoImpl;
import com.model.Student;

public class InsertStudent2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter roll: ");
		int roll= sc.nextInt();
		
		System.out.println("enter name: ");
		String name = sc.next();
		
		System.out.println("enter marks: ");
		int marks=sc.nextInt();
		
		StudentDao dao = new StudentDaoImpl();
		
		Student student= new Student(roll, name, marks);
		String result=dao.insertStudentDetails2(student);
		
		System.out.println(result);
		
		sc.close();

	}

}
