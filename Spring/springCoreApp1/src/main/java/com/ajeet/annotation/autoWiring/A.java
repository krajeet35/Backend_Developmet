package com.ajeet.annotation.autoWiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class A {
	@Autowired
	private B b;
	
	public void showA() {
		System.out.println("inside showA of A class");
		System.out.println(b);
	}

}
