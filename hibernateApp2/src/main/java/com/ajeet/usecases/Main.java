package com.ajeet.usecases;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ajeet.entity.Student;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("studentUnit2");
		EntityManager em= emf.createEntityManager();
		Student s= new Student("preeti",400);
		
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		
		
		
		
		em.close();

	}

}
