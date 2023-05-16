package com.ajeet.usecases;

import java.util.List;

import javax.persistence.EntityManager;

import com.ajeet.model.Department;
import com.ajeet.model.Department2;
import com.ajeet.model.Department3;
import com.ajeet.model.Department4;
import com.ajeet.model.Department5;
import com.ajeet.model.Department6;
import com.ajeet.model.Employee;
import com.ajeet.model.Employee2;
import com.ajeet.model.Employee3;
import com.ajeet.model.Employee4;
import com.ajeet.model.Employee5;
import com.ajeet.model.Employee6;
import com.ajeet.utility.EMUtil;
import com.mysql.cj.Query;

public class Main {

	public static void main(String[] args) {
		EntityManager em= EMUtil.provideEntityManager();
		
//		One to many (Unidirectional)
		/*
		Employee e1= new Employee("aj", 50000);
		Employee e2= new Employee("ram", 34112);
		
		Department d1= new Department("HR", "Delhi");
		d1.getLs().add(e1);
		d1.getLs().add(e2);
		
		em.getTransaction().begin();
//		em.persist(e1);
//		em.persist(e2);
		em.persist(d1);
		
		em.getTransaction().commit();
		
		*/
		
//		Adding one more employee in dept 1
		
		/*
		Department d1= em.find(Department.class, 1);
		
		if(d1==null) {
			System.out.println("Department not found ");
		}
		else {
			Employee e3= new Employee("Ajeet kumar", 56541);
			
			em.getTransaction().begin();
			d1.getLs().add(e3);
			em.getTransaction().commit();
		}
		*/
		
//		Get all employee from hr department
		/*
		String str1= "select ls from Department where dname='HR'";
		
		javax.persistence.Query q1= em.createQuery(str1);
		
		List<Employee> ls1= q1.getResultList();
		
		System.out.println(ls1);
		
		*/
		
		
//		Many to one Unidirectional
		/*
		Department2 d4= new Department2("Sales", "Mumbai");
		
		Employee2 e1= new Employee2("Ravi", 64564,d4);
		Employee2 e2= new Employee2("Shyam", 54465,d4);
		
		em.getTransaction().begin();
		em.persist(e1);
		em.persist(e2);
		em.getTransaction().commit();
		*/
		
		
//		One to many bidirectional
		/*
		Department3 d1= new Department3();
		d1.setDname("Prodution");
		d1.setLocation("Bangalore");
		
		Employee3 e5= new Employee3();
		e5.setName("Amresh");
		e5.setSalary(65456);
		e5.setDept(d1);
		
		Employee3 e6= new Employee3();
		e6.setName("Rupesh");
		e6.setSalary(64547);
		e6.setDept(d1);	
		
		d1.getLs().add(e5);
		d1.getLs().add(e6);
		
		em.getTransaction().begin();
		em.persist(d1);
		em.getTransaction().commit();
		*/
		
//		get all the employee in a particulr department
		/*
		Department3 d1= em.find(Department3.class, 1);
		List<Employee3> ls2= d1.getLs();
		
		ls2.forEach(s -> System.out.println(s.getName()));
		*/
		
//		Many to many
		/*
		Department4 d1= new Department4();
		d1.setDname("Sales");
		d1.setLocation("Noida");

		Department4 d2= new Department4();
		d2.setDname("HR");
		d2.setLocation("Mumbai");
		
		Employee4 e1= new Employee4();
		e1.setName("Ramesh");
		e1.setSalary(46546);

		Employee4 e2= new Employee4();
		e2.setName("Vignesh");
		e2.setSalary(46454);
		
		
		e1.getDls().add(d1);
		e2.getDls().add(d1);
		
		d1.getLs().add(e1);
		d1.getLs().add(e2);
		
		e2.getDls().add(d2);
		d2.getLs().add(e2);
		em.getTransaction().begin();
		em.persist(d1);
		em.persist(d2);
		em.getTransaction().commit();
		*/
		
		
//		Get list of employee
		/*
		Department4 ls= em.find(Department4.class, 1);
		List<Employee4> ls1=ls.getLs();
		
		ls1.forEach(s -> System.out.println(s.getName()));
		*/
		
		
//		One to one
//		unidirectional
		/*
		Employee5 e1= new Employee5();
		e1.setName("Rahu");
		e1.setSalary(646546);
		
		Department5 d1= new Department5();
		d1.setDname("Quality");
		d1.setLocation("Patna");
		
		d1.setEmp(e1);
		
		em.getTransaction().begin();
		
		em.persist(d1);
		
		em.getTransaction().commit();
		
		*/
//		Bi-directional
//		One to one
		/*
		Employee6 e1= new Employee6();
		e1.setName("Rahu");
		e1.setSalary(646546);
		
		Department6 d1= new Department6();
		d1.setDname("Quality");
		d1.setLocation("Patna");
		
		e1.setDept(d1);
		d1.setEmp(e1);
		
		em.getTransaction().begin();
		
		em.persist(d1);
		
		em.getTransaction().commit();
		*/
//		get employee details by deptid
		
		Department6 d1= em.find(Department6.class, 1);
		Employee6 e1=d1.getEmp();
		
		System.out.println(e1.getName());
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("done...");
		em.close();

	}

}
