package com._203;

import java.util.concurrent.Callable;

public class Callable1 implements Callable {
	private int num=0;
	
	public Callable1(int num) {
		this.num=num;
	}

	@Override
	public Object call() throws Exception {
		System.out.println(Thread.currentThread().getName()+".. is responsible to find the sum of first "+ num+" numbers");
		int sum=0;
		for(int i=0;i<=num;i++) {
			sum+=i;
		}
		return sum;
	}

}
