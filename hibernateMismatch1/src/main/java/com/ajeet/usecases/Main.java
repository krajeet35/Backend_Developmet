package com.ajeet.usecases;

import javax.persistence.EntityManager;

import com.ajeet.model.Address;
import com.ajeet.model.Employee;
import com.ajeet.model.Employee2;
import com.ajeet.model.Employee3;
import com.ajeet.utility.EMUtil;

public class Main {

	public static void main(String[] args) {
		
		EntityManager em= EMUtil.provideEMConnection();
		/*
		Employee emp1= new Employee();
		emp1.setEname("Ajeet kumar");
		emp1.setSalary(500000);
		emp1.setAddr(new Address("Muz", "Bihar", "842513"));
		
		em.getTransaction().begin();
		
		em.persist(emp1);
		
		em.getTransaction().commit();
		*/
		/*
		Employee2 emp2= new Employee2();
		
		emp2.setName("Ajeet");
		emp2.setSalary(80000);
		emp2.setHomeA(new Address("kengeri", "Karnataka", "562228"));
		emp2.setOfficeA(new Address("muz", "bihar", "846627"));
		
		em.getTransaction().begin();
		
		em.persist(emp2);
		
		em.getTransaction().commit();
		*/
		Employee3 emp3=new Employee3();
		emp3.setName("Ajeet kumar");
		emp3.setSalary(80000);
		emp3.getAdd().add(new Address("kengeri", "Bihar", "845215"));
		emp3.getAdd().add(new Address("kengeri", "Karnataka", "845557"));
		
		em.getTransaction().begin();
		
		em.persist(emp3);
		
		em.getTransaction().commit();
		
		System.out.println("Done...");
		
		
		
		
		
		
		
		
		
		
		
		em.close();

	}

}
