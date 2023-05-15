package com.ajeet.collectionInjection;

import java.util.List;

public class A {
	private List<String> names;

	public void setNames(List<String> names) {
		this.names = names;
	}
	
	public void show() {
		System.out.println("inside show of A");
		System.out.println(names);
	}

}
