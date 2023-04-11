package com._102;

public class IntImpl implements Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interface1 i1 = new IntImpl();
		i1.fun1();
		i1.fun2();
		
		IntImpl i2= new IntImpl();
		i2.fun4();
		Interface1.fun3();
	}

	@Override
	public void fun1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int fun2() {
		// TODO Auto-generated method stub
		return 0;
	}
	void fun4() {
		
	}

}
