package com.UseCases;

import java.util.Scanner;

import com.dao.StudentDao;
import com.dao.StudentDaoImpl;
import com.model.Student;

public class GetStudentByRoll {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter roll: ");
		int roll= sc.nextInt();
		
		StudentDao sd= new StudentDaoImpl();
		Student student = sd.getStudentByRoll(roll);
		
		if(student !=null) {
			System.out.println(student);
		}
		else {
			System.out.println("Student not exist..");
		}
	}

}
