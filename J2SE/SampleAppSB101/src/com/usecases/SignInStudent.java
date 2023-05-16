package com.usecases;

import java.util.Scanner;

import com.dao.StudentDao;
import com.dao.StudentDaoImpl;
import com.exceptions.StudentException;
import com.model.Student;

public class SignInStudent {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter your username/email: ");
		String user= sc.next();
		
		System.out.println("enter your password: ");
		String pass= sc.next();
		
		StudentDao sd= new StudentDaoImpl();
		
		try {
			Student student= sd.signInStudent(user, pass);
			System.out.println("Welcome "+student.getName());
		}
		catch(StudentException e) {
			System.out.println(e.getMessage());
		}

	}

}
