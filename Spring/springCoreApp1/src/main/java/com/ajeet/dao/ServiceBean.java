package com.ajeet.dao;

public class ServiceBean {
	private DaoBean db;

	
	
	public ServiceBean(DaoBean db) {
		super();
		this.db = db;
	}



	public void calculateInterest() {
		db.findAccount();
		
		System.out.println("Interest is calculated in service Bean");
	}

}
