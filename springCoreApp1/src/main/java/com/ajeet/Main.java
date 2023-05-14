package com.ajeet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
//		Activate the Spring IOC container
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		Pulling the Spring bean obj with the help of id
//		MyBusiness obj=ctx.getBean("mb", MyBusiness.class);
//		Travel tr= ctx.getBean("tr", Travel.class);
//		Travel tr2= ctx.getBean("tr2", Travel.class);
		
//		tr.journey();
//		tr2.journey();
		
		A a1= ctx.getBean("ao", A.class);
		
		a1.funA();
		

	}

}
