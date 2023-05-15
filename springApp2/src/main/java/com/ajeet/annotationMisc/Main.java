package com.ajeet.annotationMisc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ajeet.utility.AppConfig;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		
		A a1= ctx.getBean("a",A.class);
		
		a1.showA();
	}

}
