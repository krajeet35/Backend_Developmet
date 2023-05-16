package com.ajeet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;

@Entity
@NamedNativeQuery(name="allAccount", query="select * from account",resultClass=Account.class)
@NamedQuery(name="account.getBalance", query="select balance from Account")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int acc;
	private String name;
	private int balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String name, int balance) {
		super();
//		this.acc = acc;
		this.name = name;
		this.balance = balance;
	}
	
	public Account(int acc, int balance) {
		super();
		this.acc=acc;
		this.balance=balance;
	}

	@Override
	public String toString() {
		return "Account [acc=" + acc + ", name=" + name + ", balance=" + balance + "]";
	}

	public int getAcc() {
		return acc;
	}

	public void setAcc(int acc) {
		this.acc = acc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	

}
