package com.ajeet.usecases;

import java.util.Scanner;

import com.ajeet.dao.AccountDao;
import com.ajeet.dao.AccountDaoImpl;
import com.ajeet.model.Account;

public class CreateAccount {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter A/c holder name: ");
		String name=sc.nextLine();
		
		System.out.println("enter balance: ");
		int balance= sc.nextInt();
		
		AccountDao ad= new AccountDaoImpl();
		
		Account ac= new Account(name, balance);
		
	    ad.createAccount(ac);
		

	}

}
