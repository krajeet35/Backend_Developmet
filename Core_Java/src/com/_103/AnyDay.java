package com._103;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AnyDay {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Date in dd-mm-yyyy");  
		String date= sc.next();
		DateTimeFormatter db= DateTimeFormatter.ofPattern("dd-MM-yyyy");
		try {
			LocalDate d1= LocalDate.parse(date, db);
			String day= d1.format(DateTimeFormatter.ofPattern("EEEE"));
			System.out.println(d1+" on this date day was "+day);
		} catch (Exception e) {
			
			System.out.println("Please enter valid date");
		}
		

	}

}
