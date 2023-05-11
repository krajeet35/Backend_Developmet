package com.ajeet.usecases;

import java.util.Scanner;

import com.ajeet.dao.AccountDao;
import com.ajeet.dao.AccountDaoImpl;
import com.ajeet.model.Account;

public class FindAccount {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter A/c no.: ");
		int acc= sc.nextInt();
		
		AccountDao ad= new AccountDaoImpl();
		Account ac=ad.findAccount(acc);
		
		System.out.println(ac);

	}

}
