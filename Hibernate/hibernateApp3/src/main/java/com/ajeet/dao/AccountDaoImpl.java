package com.ajeet.dao;

import javax.persistence.EntityManager;

import com.ajeet.model.Account;
import com.ajeet.utility.EMUtil;

public class AccountDaoImpl implements AccountDao {

	@Override
	public boolean createAccount(Account acc) {
		boolean flag=false;
		EntityManager em=EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(acc);
		flag=true;
		em.getTransaction().commit();
		em.close();
		System.out.println("Account created successfully....");
		return flag;
	}

	@Override
	public boolean deleteAccount(int acc) {
		boolean flag=false;
		EntityManager em=EMUtil.provideEntityManager();
		Account acc1= em.find(Account.class, acc);
		if(acc1 != null) {
			em.getTransaction().begin();
			
			em.remove(acc1);
			flag=true;
			em.getTransaction().commit();
			System.out.println("Account deleted successfully...");
			em.close();
		}
		else {
			System.out.println("Account not fount with A/c no. "+acc);
//			throw new IllegalArgumentException("Account not fount with A/c no. "+acc);
		}
		return flag;
	}

	@Override
	public boolean updateAccount(Account acc) {
		boolean flag=false;
		EntityManager em=EMUtil.provideEntityManager();
		Account acc1= em.find(Account.class, acc.getAcc());
		if(acc1 != null) {
			em.getTransaction().begin();
			acc1.setBalance(acc.getBalance());
//			em.merge(acc);
			flag=true;
			em.getTransaction().commit();
			System.out.println("Account updated successfully...");
			em.close();
		}
		else {
			System.out.println("Account not fount with A/c no. "+acc);
//			throw new IllegalArgumentException("Invalid Account");
		}
		return flag;
	}

	@Override
	public Account findAccount(int acc) {
		Account acc1=null;
		EntityManager em=EMUtil.provideEntityManager();
		acc1= em.find(Account.class, acc);
		if(acc1==null) {
			throw new IllegalArgumentException("Account not fount with A/c no. "+acc);
		}
		return acc1;
	}

}
