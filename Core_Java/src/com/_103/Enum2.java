package com._103;

public enum Enum2 {
	DELHI{
		
		@Override
		public void message() {
			System.out.println("Welcome User you are in Capital");
			System.out.println("Tower in your area "+towerNo);
		
		}
		
	},MUMBAI,KOLKATA,CHENNAI;
	String towerNo;
	private Enum2() {
		this.towerNo="100 towers";
	}
	
	Enum2(String towers){
		this.towerNo=towers;
	}
	
	public void message() {
		System.out.println("Welcome User");
		System.out.println("Tower in your area "+towerNo);
	}

}
