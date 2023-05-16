package com.coupling;

public class Bike implements Vehicle {
	
	public void ride() {
		System.out.println("Ride started...");
	}

	@Override
	public void go() {
		ride();
		
	}

}
