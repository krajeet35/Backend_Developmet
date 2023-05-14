package com.ajeet.dao;

public class PresentBean {
	
	private ServiceBean sb;

	public ServiceBean getSb() {
		return sb;
	}

	public void setSb(ServiceBean sb) {
		this.sb = sb;
	}
	
	public void present() {
		sb.calculateInterest();
		System.out.println("Calculated interest is presented by presentation bean");
	}

}
