package com.coupling;

public class Travel {
	
//	Car c= new Car();
//	Bike b= new Bike();
	private Vehicle v;
	
	
//	Constructor injection point
	public Travel(Vehicle v) {
	super();
	this.v = v;
}
	
//	Setter injection point
	public void setV(Vehicle v) {
		this.v = v;
	}



	public void journey() {
//		c.start();
//		b.ride();
		v.go();
		System.out.println("Journey started...");
	}

	

}
