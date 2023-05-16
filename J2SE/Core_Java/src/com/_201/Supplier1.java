package com._201;

import java.util.function.Supplier;

public class Supplier1 implements Supplier<String> {

	@Override
	public String get() {
		
		return "Welcome from external";
	}

}
