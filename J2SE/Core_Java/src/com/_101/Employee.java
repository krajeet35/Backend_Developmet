package com._101;

public class Employee {
	int id;
	String name;
	int salary;
	Address adress;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee();
		e1.id=1;
		e1.name="Ajeet roy";
		e1.salary=50000;
		e1.adress= new Address();
		e1.adress.state="Bihar";
		e1.adress.city="Muz";
		e1.adress.pincode="843113";
		
		Employee e2 = new Employee();
		e2.id=10;
		e2.name="Ranjeet roy";
		e2.salary=60000;
		e2.adress= new Address();
		e2.adress.state="Uttrakhand";
		e2.adress.city="HW";
		e2.adress.pincode="249403";
		
		e1.printDetails();
		e2.printDetails();
		

	}
	
	void printDetails() {
		System.out.println("Employee Id: "+id);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Salary: "+salary);
		System.out.println("Employee State: "+adress.state);
		System.out.println("Employee city: "+adress.city);
		System.out.println("Employee pincode: "+adress.pincode);
		System.out.println("======================");
	}

}
