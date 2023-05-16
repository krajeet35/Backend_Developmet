package com._102;

public interface Hotel {
	
	void biryani();
	void curry();
	default void iceCream() {
		System.out.println("ice cream from hotel");;
	}
	
	static void water() {
		System.out.println("water from hotel");
	}

}
