package com.ajeet.usecases;

import javax.persistence.EntityManager;

import com.ajeet.models.ContractEmployee;
import com.ajeet.models.Employee;
import com.ajeet.models.Employee2;
import com.ajeet.models.SalaryEmployee;
import com.ajeet.utility.EMUtil;

public class Main {

	public static void main(String[] args) {
		EntityManager em = EMUtil.provideEntityManager();
		
//		Single table
		/*
		Employee e1= new Employee();
		e1.setName("Ajeet");
		
		ContractEmployee ce1= new ContractEmployee();
		ce1.setName("Raju");
		ce1.setwDays(20);
		ce1.setCostPDay(400);
		
		SalaryEmployee sl1= new SalaryEmployee();
		sl1.setName("Mohan");
		sl1.setSalary(54564);
		
		em.getTransaction().begin();
		
		em.persist(e1);
		em.persist(sl1);
		em.persist(ce1);
		
		em.getTransaction().commit();
		
		*/
		
//		Joined table
		
		Employee2 e1= new Employee2();
		e1.setName("Ajeet");
		
		ContractEmployee ce1= new ContractEmployee();
		ce1.setName("Raju");
		ce1.setwDays(20);
		ce1.setCostPDay(400);
		
		SalaryEmployee sl1= new SalaryEmployee();
		sl1.setName("Mohan");
		sl1.setSalary(54564);
		
		em.getTransaction().begin();
		
		em.persist(e1);
		em.persist(sl1);
		em.persist(ce1);
		
		em.getTransaction().commit();
		
		
		
		
		
		
		
		
		System.out.println("done....");
		em.close();

	}

}
