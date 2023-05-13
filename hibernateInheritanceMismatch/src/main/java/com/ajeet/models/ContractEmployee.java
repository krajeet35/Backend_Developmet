package com.ajeet.models;

import javax.persistence.Entity;

@Entity
public class ContractEmployee extends Employee {
	
	private int wDays;
	private int costPDay;
	
	public int getwDays() {
		return wDays;
	}

	public void setwDays(int wDays) {
		this.wDays = wDays;
	}

	public int getCostPDay() {
		return costPDay;
	}

	public void setCostPDay(int costPDay) {
		this.costPDay = costPDay;
	}

	@Override
	public String toString() {
		return "ContractEmployee [wDays=" + wDays + ", costPDay=" + costPDay + "]";
	}
	
	

}
