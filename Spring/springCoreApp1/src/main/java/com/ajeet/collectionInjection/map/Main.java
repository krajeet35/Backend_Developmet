package com.ajeet.collectionInjection.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext4.xml");
		
		A a1=ctx.getBean("a1",A.class);
		a1.show();
	}

}
