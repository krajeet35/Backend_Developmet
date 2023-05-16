package com.ajeet.collectionInjection.map;

import java.util.Map;

public class A {
	
	private Map<Student,String> map;

	public void setMap(Map<Student, String> map) {
		this.map = map;
	}
	
	public void show() {
		System.out.println("inside show of A");
		System.out.println(map);
	}

	@Override
	public String toString() {
		return "A [map=" + map + "]";
	}
	

}
