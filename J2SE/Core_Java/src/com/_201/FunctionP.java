package com._201;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com._103.Employee;

public class FunctionP {

	public static void main(String[] args) {
//		Using external class
		Funtionalntr i1= new Impl1();
		i1.sayHello("Ajeet");
		
//		Using Anonymous inner class
		Funtionalntr i2= new Funtionalntr() {
			
			@Override
			public void sayHello(String name) {
				System.out.println("inside FunctionaP class using Anonymous class");
				System.out.println("Hello "+name);
				
			}
		};
		i2.sayHello("Roy");
		
//		Using Lambda expression
		Funtionalntr i3= n-> System.out.println("Hello "+n);
		i3.sayHello("Ajeet roy");
		
//		Sort method using Anonymous class, Lambda expression and Method reference
		
		List<Employee> e1= new ArrayList<>();
		e1.add(new Employee(1, "Aj", "eng", 40000));
		e1.add(new Employee(4, "dhkAj", "eng", 60000));
		e1.add(new Employee(2, "Ajsjdh", "eng", 80000));
		e1.add(new Employee(5, "Ajjd", "eng", 30000));
		e1.add(new Employee(6, "Ajkjdk", "eng", 70000));
		System.out.println("Normal: ");
		System.out.println(e1);
//		Using Anonymous class
		Collections.sort(e1, new Comparator<Employee>(){

			@Override
			public int compare(Employee o1, Employee o2) {
				if(o1.getId()> o2.getId()) {
					return +1;
				}
				else {
					return -1;	
				}
				
			}
			
		});
		System.out.println("Using Anonymous: ");
		System.out.println(e1);
		
//		Using Lambda expression
		e1.sort((o1, o2) -> o1.getSalary()> o2.getSalary() ? +1:-1);
		System.out.println("Using Lambda: ");
		System.out.println(e1);
		
//		Using Method reference 
		
		
		
		
		
		
		
		
		
		

	}

}
