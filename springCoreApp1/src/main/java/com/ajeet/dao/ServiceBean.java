package com.ajeet.dao;

public class ServiceBean {
	private DaoBean db;

	public DaoBean getDb() {
		return db;
	}

	public void setDb(DaoBean db) {
		this.db = db;
	}
	
	public void calculateInterest() {
		db.findAccount();
		
		System.out.println("Interest is calculated in service Bean");
	}

}
