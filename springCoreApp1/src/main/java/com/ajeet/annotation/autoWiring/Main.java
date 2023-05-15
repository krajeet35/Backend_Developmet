package com.ajeet.annotation.autoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext7.xml");
		
		A a1=ctx.getBean("a",A.class);
		
		B b1=ctx.getBean("b",B.class);
		
		a1.showA();
		b1.showB();
	}

}
