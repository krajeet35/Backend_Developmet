package com._103;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTime {

	public static void main(String[] args) {
		LocalDateTime ld = LocalDateTime.now();
		System.out.println(ld);
		
		LocalDate day= LocalDate.of(1995, 06, 14);
		System.out.println(day);
		
		DateTimeFormatter f1= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String str= day.format(f1);
		System.out.println(str);
		
		String str1= "25/06/1984";
		
		System.out.println(str1);
		
		LocalDate ld2= LocalDate.parse(str1, f1);
		System.out.println(ld2);
		
//		ChronoUnit
		
		LocalDate ld1= LocalDate.of(1995, 06, 14);
		LocalDate ld3= LocalDate.now();
		
		System.out.println(ChronoUnit.YEARS.between(ld1, ld3));
		
	}

}
