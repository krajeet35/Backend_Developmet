package com.ajeet.usecases;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("============================");
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Welcome to the MyBank");
		System.out.println("1 Choose for create new Account");
		System.out.println("2 Choose to delete the Account");
		System.out.println("3 Choose to deposit the Amount");
		System.out.println("4 Choose to find the A/c details");
		
		int ch1= sc.nextInt();
		
		switch (ch1) {
		case 1:
			CreateAccount.main(args);
			Main.main(args);
			break;
		case 2: DeleteAccount.main(args);
		        Main.main(args);
		        break;
		case 3: UpdateAccount.main(args);
		        Main.main(args);
		        break;
		case 4: FindAccount.main(args);
		        Main.main(args);
		        break;

		default: System.out.println("Invalid input..");
			break;
		}
		sc.close();

	}

}
