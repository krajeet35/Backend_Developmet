package com.ajeet.usecases;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ajeet.entity.Student;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("studentUnit");
		EntityManager em= emf.createEntityManager();
		/*
		 * Retrive data from table
		 
		Student st=em.find(Student.class, 1);
		
		if(st != null) {
			System.out.println(st);
		}
		else {
			System.out.println("Record not found..");
		}
		*/
		
		/*
//		Insert into table
		Student s1= new Student(5, "chanchal", 450);
//		EntityTransaction et= em.getTransaction();
//		et.begin();
//		
//		em.persist(s1);
//		
//		et.commit();
		
		em.getTransaction().begin();
		em.persist(s1);
		em.getTransaction().commit();
		
		System.out.println("Student saved...");
		
		*/
		/*
//		Delete operation
		Scanner sc= new Scanner(System.in);
		System.out.println("enter roll to delete: ");
		int roll= sc.nextInt();
		
		Student s2= em.find(Student.class, roll);
		if(s2 != null) {
			em.getTransaction().begin();
			em.remove(s2);
			em.getTransaction().commit();
			System.out.println("Student removed....");
		}
		else {
			System.out.println("Student not found with roll "+roll);
		}
		*/
		
//		Update operation
		Scanner sc= new Scanner(System.in);
		System.out.println("enter roll to give grace marks: ");
		int roll= sc.nextInt();
		
		Student s3= em.find(Student.class, roll);
		if(s3 != null) {
			System.out.println("enter the grace marks: ");
			int marks= sc.nextInt();
			em.getTransaction().begin();
			s3.setMarks(s3.getMarks()+marks);
			em.getTransaction().commit();
			System.out.println("Marks updated..");
		}
		else {
			System.out.println("Student not found with roll "+roll);
		}
		
		em.close();

	}

}
