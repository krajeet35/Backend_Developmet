package com.ajeet.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {
	
	private static EntityManagerFactory emf;
	
	static {
		emf= Persistence.createEntityManagerFactory("spring2");
		
	}
	
	public static EntityManager provideEM() {
		return emf.createEntityManager();
	}

}
