package com._103;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> m1= new HashMap<>();
		m1.put("name", "Ak");
		m1.put("post", "eng");
		m1.put("course", "java");
		m1.put("name", "Ar");
		
		System.out.println(m1);
		
		Map<String,String> m2= new LinkedHashMap<>();
		m2.put("name", "Ak");
		m2.put("post", "eng");
		m2.put("course", "java");
		m2.put("name", "Ar");
		
		System.out.println(m2);
		
		
		Map<String,String> m3= new Hashtable<>();
		m3.put("name", "Ak");
		m3.put("post", "eng");
		m3.put("course", "java");
		m3.put("name", "Ar");
		
		System.out.println(m3);
		
		Map<String,String> m4= new IdentityHashMap<>();
		m4.put("name", "Ak");
		m4.put("post", "eng");
		m4.put("course", "java");
		m4.put("name", "Ar");
		
		System.out.println(m4);
		
		Map<String,String> m5= new WeakHashMap<>();
		m5.put("name", "Ak");
		m5.put("post", "eng");
		m5.put("course", "java");
		m5.put("name", "Ar");
		
		System.out.println(m5);

	}

}
