package com.usecases;

import java.util.Scanner;

import com.dao.StudentDao;
import com.dao.StudentDaoImpl;
import com.exceptions.StudentException;
import com.model.Student;

public class RegisterStudent {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter name: ");
		String name= sc.next();
		
		System.out.println("enter email: ");
		String email= sc.next();
		
		System.out.println("enter password: ");
		String pass= sc.next();
		
		Student s= new Student();
		s.setName(name);
		s.setEmail(email);
		s.setPassword(pass);
		
		StudentDao sd= new StudentDaoImpl();
		try {
		String result=sd.registerStudent(s);
		System.out.println(result);
		}
		catch(StudentException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
