package com.ajeet.usecases;

import javax.persistence.EntityManager;

import com.ajeet.model.Department;
import com.ajeet.model.Employee;
import com.ajeet.utility.EMUtil;

public class Main {

	public static void main(String[] args) {
		EntityManager em= EMUtil.provideEntityManager();
		
//		One to many (Unidirectional)
		
		Employee e1= new Employee("aj", 50000);
		Employee e2= new Employee("ram", 34112);
		
		Department d1= new Department("HR", "Delhi");
		d1.getLs().add(e1);
		d1.getLs().add(e2);
		
		em.getTransaction().begin();
		em.persist(e1);
		em.persist(e2);
		em.persist(d1);
		
		em.getTransaction().commit();
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("done...");
		em.close();

	}

}
