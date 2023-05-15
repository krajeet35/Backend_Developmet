package com.ajeet.collectionInjection;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
//		Single List injection
		/*
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		A a1= ctx.getBean("aid", A.class);
		
		a1.show();
		*/
		
//		Reference List object injection
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext3.xml");
		
		College clg1= ctx.getBean("clg1",College.class);
		List<Student> s1=clg1.getStudents();
		System.out.println("College: "+clg1.getCollegeName());
		s1.forEach(s ->{
			s.display();
			System.out.println("==================");
		});
		
		
		
		College clg2= ctx.getBean("clg2",College.class);
		
		List<Student> s2=clg2.getStudents();
		System.out.println("College: "+clg2.getCollegeName());
		s2.forEach(s ->{
			s.display();
			System.out.println("==================");
		});
		
	}

}
