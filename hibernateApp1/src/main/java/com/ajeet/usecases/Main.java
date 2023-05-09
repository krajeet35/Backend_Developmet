package com.ajeet.usecases;

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
		
		
		
		
		em.close();

	}

}
