package com.ajeet;

public class Travel {
	
//	Car c= new Car();
//	Bike b= new Bike();
	private Vehicle v;
	
	private int numberOfPerson;
	
	
//	Constructor injection point
//	public Travel(Vehicle v, int numberOfPerson) {
//		super();
//		this.v = v;
//		this.numberOfPerson = numberOfPerson;
//	}

	
//	Setter injection point
	public void setV(Vehicle v) {
		this.v = v;
	}


	


	public void setNumberOfPerson(int numberOfPerson) {
		this.numberOfPerson = numberOfPerson;
	}



	public void journey() {
//		c.start();
//		b.ride();
		v.go();
		System.out.println("Journey started...");
		System.out.println("Number of Person: "+numberOfPerson);
	}

	

}
