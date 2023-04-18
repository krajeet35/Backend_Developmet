package com._203;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {

	public static void main(String[] args) throws IOException {
		InputStreamReader is= new InputStreamReader(System.in);
		BufferedReader br=  new BufferedReader(is);
		System.out.println("enter name: ");
		String name= br.readLine();
		System.out.println("enter roll: ");
		int roll= Integer.parseInt(br.readLine());
		
		System.out.println(name+"......."+roll);
		

	}

}
