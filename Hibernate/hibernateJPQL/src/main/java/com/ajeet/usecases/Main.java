package com.ajeet.usecases;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.ajeet.model.Account;
import com.ajeet.utility.EMUtil;


public class Main {

	public static void main(String[] args) {
		EntityManager em= EMUtil.provideEMConnection();
		/*
/*
//  Retrieve data
 
  
		String q1= "from Account where name='Ajeet kumar'";
		
		Query que= em.createQuery(q1);
		
		List<Account> ls= que.getResultList();
		
		ls.forEach(s -> System.out.println(s));
		
		
		String s2= "select a from Account a where a.acc=6";
//		Query q2= em.createQuery(s2);
//		Object obj1= q2.getSingleResult();
//		Account ac= (Account) obj1;
//		System.out.println((Account)obj1);
		
		TypedQuery<Account> q3= em.createQuery(s2,Account.class);
		Account ac1= q3.getSingleResult();
		System.out.println(ac1);
		*/
		
		
//		bulk update
		/*
		String s3= "update Account set balance=balance+500";
		Query q3= em.createQuery(s3);
		
		em.getTransaction().begin();
		int x=q3.executeUpdate();
		em.getTransaction().commit();
		System.out.println(x+" row updated");
		
		*/
		
		
//		Update using positional parameter
		/*
		String s4="update Account set balance=balance+?5 where name=?6";
		Query q4= em.createQuery(s4);
		q4.setParameter(5, 50);
		q4.setParameter(6, "Ajeet kumar");
		
		em.getTransaction().begin();
		
		int x= q4.executeUpdate();
		em.getTransaction().commit();
		
		System.out.println(x+" row updated");
		*/
		
		
//		Update using named parameter
		/*
		String s5="update Account set balance=balance+:bal where name=:nam";
		Query q5= em.createQuery(s5);
		q5.setParameter("bal", 100);
		q5.setParameter("nam", "Ajeet kumar");
		
		em.getTransaction().begin();
		
		int x= q5.executeUpdate();
		em.getTransaction().commit();
		
		System.out.println(x+" row updated");
		*/
		
		
//		Get single column
		/*
		String s6= "select a.name from Account a where a.acc=6";
		Query q6= em.createQuery(s6);
		
		String name= (String) q6.getSingleResult();
		
		TypedQuery<String> q6= em.createQuery(s6,String.class);
		String name= q6.getSingleResult();
		System.out.println(name);
		*/
		
		
//		Multiple rows one column;
		/*
		String s7= "select a.name from Account a";		
		TypedQuery<String> q7= em.createQuery(s7,String.class);
		List<String> ls= q7.getResultList();
		
		ls.forEach(n -> System.out.println(n));
		
		*/
//		few column all rows
		/*
		String s8="select a.name, a.acc from Account a ";
		Query q8= em.createQuery(s8);
		
		List<Object[]> ls= q8.getResultList();
		
		for(Object[] obj:ls) {
			String name= (String) obj[0];
			int ac= (int) obj[1];
			
			System.out.println(name+" "+ac);
			System.out.println("==============");
		}
		*/
		
		
//		few column single row
		/*
		String s9="select a.name, a.acc from Account a where a.acc=6 ";
		/*
		Query q9= em.createQuery(s9);
		
		Object[] obj= (Object[]) q9.getSingleResult();
		
		TypedQuery<Object[]> q9= em.createQuery(s9,Object[].class);
		Object[] obj= q9.getSingleResult();
			String name= (String) obj[0];
			int ac= (int) obj[1];
			
			System.out.println(name.toUpperCase()+" "+ac);
		
		
		*/
		
		
//		Aggregrate function
		/*
		String s10= "select sum(balance) from Account";
		TypedQuery<Long> q10= em.createQuery(s10,Long.class);
		
		long sum=q10.getSingleResult();
		
		System.out.println(sum);
		*/
		
		
//		Named query
		/*
		Query q11= em.createNamedQuery("account.getBalance");
		
		List<Integer> ls= q11.getResultList();
		
		ls.forEach(s -> System.out.println(s));
		*/
		
//		Native queries
		
		String s12= "select * from account";
		
		Query q12= em.createNativeQuery(s12,Account.class);
		
		List<Account> ls= q12.getResultList();
		
//		ls.forEach(s -> System.out.println(s));
		
		
//		Named Native query
		Query q13= em.createNamedQuery("allAccount");
		
		List<Account> ls1= q13.getResultList();
		
		ls1.forEach(s-> System.out.println(s));
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		em.close();

	}

}
