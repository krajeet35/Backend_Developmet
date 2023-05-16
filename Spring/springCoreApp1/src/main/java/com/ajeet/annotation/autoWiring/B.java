package com.ajeet.annotation.autoWiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class B {
	@Autowired
	private A a;
	
	public void showB() {
		System.out.println("inside showB of B class");
		System.out.println(a);
	}

}
