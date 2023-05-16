package com._103;

public class VarArgs {
	
	public static int add(int... arr) {
		
		int sum=0;
		for(int a:arr) {
			sum+=a;
		}
	
		return sum;
		
	}
	
	public static int user(String opr, int... arr) {
		int res=0;
		if(opr=="+") {
			for(int i:arr) {
				res+=i;
			}
		}
		else if(opr=="*") {
			res=1;
			for(int i:arr) {
				res*=i;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		
		int x= add(5,10,5,5,2,3);
		System.out.println(x);
		
		int y= user("*", 5,6,8,7,1);
		System.out.println(y);
		

	}

}
