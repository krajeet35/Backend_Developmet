package com.ajeet.collectionInjection.properties;

import java.util.Properties;

public class A {
	private Properties pr;

	public void setPr(Properties pr) {
		this.pr = pr;
	}
	
	public void show() {
		System.out.println("inside show of A");
		System.out.println(pr);
	}

}
