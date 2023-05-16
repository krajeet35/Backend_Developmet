package com.ajeet.annotationMisc;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

import com.ajeet.utility.AppConfig;
@Controller
public class InsertUsecase {
	
	@Autowired
	private StudentService ss;
	
	public void insertStudent() {
		
		Scanner sc= new Scanner(System.in);
		
//		System.out.println("enter roll: ");
//		int roll=sc.nextInt();
		
		System.out.println("enter name: ");
		String name= sc.next();
		
		System.out.println("enter marks: ");
		int marks= sc.nextInt();
		
		Student student = new Student( name, marks);
		String result=ss.saveStudent(student);
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		
	InsertUsecase is=	ctx.getBean("insertUsecase", InsertUsecase.class);
	
	is.insertStudent();
	}

}
