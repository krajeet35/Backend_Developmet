package com.ajeet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class A {
	@Autowired
	private B b1;
	
	public void funA() {
		System.out.println("inside funA of A");
		b1.funB();
	}

}
