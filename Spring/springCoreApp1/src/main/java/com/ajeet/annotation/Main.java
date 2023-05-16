package com.ajeet.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext6.xml");
		A a1=ctx.getBean("a",A.class);
		a1.funA();
	}

}
