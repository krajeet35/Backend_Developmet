package com._201;

import java.util.function.Consumer;

public class Consumer1 implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println("Welcome: "+t);
		
	}

}
