package com._102;

public class MainHotel {
	
	public Hotel food(int price) {
		Hotel h1= null;
		if(price>500) {
			 h1= new RichHotel();
		}
		else if(price>=100 && price<=500) {
			 h1= new BudgetHotel();
		}
		return h1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainHotel m1= new MainHotel();
		Hotel h =m1.food(600);
		if(h!= null){
			h.biryani();
			h.curry();
			h.iceCream();
		}
		else {
			System.out.println("Minimum amount to get food is 100 rupees");
		}

	}

}
