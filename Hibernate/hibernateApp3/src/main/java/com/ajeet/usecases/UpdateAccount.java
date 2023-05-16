package com.ajeet.usecases;

import java.util.Scanner;

import javax.persistence.EntityManager;

import com.ajeet.dao.AccountDao;
import com.ajeet.dao.AccountDaoImpl;
import com.ajeet.model.Account;
import com.ajeet.utility.EMUtil;

public class UpdateAccount {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		AccountDao ad= new AccountDaoImpl();
		
		EntityManager em = EMUtil.provideEntityManager();
		
		System.out.println("enter A/c no.: ");
		int acc=sc.nextInt();
		
		System.out.println("enter new balance: ");
		int balance=sc.nextInt();
		
		Account ac= new Account(acc,balance);

			
			em.getTransaction().begin();
			
			ad.updateAccount(ac);
			em.getTransaction().commit();
			em.close();
		}
		
		
		

	}

