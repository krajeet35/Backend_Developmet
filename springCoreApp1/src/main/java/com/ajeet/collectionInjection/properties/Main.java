package com.ajeet.collectionInjection.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext5.xml");
		
		A a1=ctx.getBean("a1",A.class);
		a1.show();
	}

}
