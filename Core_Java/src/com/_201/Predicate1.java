package com._201;

import java.util.function.Predicate;

public class Predicate1 implements Predicate<Integer> {


	@Override
	public boolean test(Integer i) {
//		if(i>0) {
//			return true;
//		}
//		else {
//			return false;
//		}
		
		return i>0;
	}

}
