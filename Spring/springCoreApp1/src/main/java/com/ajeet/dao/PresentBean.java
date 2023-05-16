package com.ajeet.dao;

import com.ajeet.A;

public class PresentBean {
	
	private ServiceBean sb;
	
	

	
	
	public PresentBean(ServiceBean sb) {
		super();
		this.sb = sb;
	}





	public void present() {
		sb.calculateInterest();
		System.out.println("Calculated interest is presented by presentation bean");
	    
	}

}
