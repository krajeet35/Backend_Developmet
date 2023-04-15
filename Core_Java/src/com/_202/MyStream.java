package com._202;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com._201.Student;

import java.util.ArrayList;

public class MyStream {

	public static void main(String[] args) {
		
		List<String> names= Arrays.asList("jbk","bs","jbdb","bdsbkj");
		System.out.println(names);
		
		Stream<String> str1= names.stream();
		str1.forEach(n -> System.out.println(n.toUpperCase()));
		
//		Filter method;
		
		List<Student> students= new ArrayList<>();
		students.add(new Student(10, "jdf", 500));
		students.add(new Student(15, "jdf", 300));
		students.add(new Student(16, "jdf", 1000));
		students.add(new Student(18, "jdf", 600));
		students.add(new Student(1, "jdf", 700));
		students.add(new Student(19, "jdf", 200));
		students.add(new Student(11, "jdf", 800));
		
//		Long method
		Stream<Student> str2= students.stream();
			
		Stream<Student> str3=str2.filter(s -> s.getMarks()>=500);
		str3.forEach(s -> System.out.println(s.toString()));
//		Sort method
		
		students.stream()
		.filter(s -> s.getMarks()>=500)
		.forEach(s -> System.out.println(s));
		
//		filter and save in list
		
		List<Student> list2= students.stream()
				.filter(s -> s.getMarks()>=400)
				.collect(Collectors.toList());
		System.out.println(list2);
		
		list2.forEach(s -> System.out.println(s));
		
		
//		Give 50 grace marks to all students who have less than
//		500 marks and get another list of such students.
		
//		Map
		
		List<Student> list3= students.stream()
				.filter(s -> s.getMarks()<500)
				.map(s -> new Student(s.getRoll(), s.getName(), s.getMarks()+50))
				.collect(Collectors.toList());
		
		System.out.println(list3);
		
		
//		Min and Max
		Optional<Student> opt1=students.stream()
		.min((s1,s2) -> s1.getMarks()<s2.getMarks() ? +1 : -1);
		
		System.out.println(opt1);
		Student maxS= opt1.get();
		System.out.println(maxS);
		
//		Count
		long count= students.stream()
				.filter(s-> s.getMarks()>500)
				.count();
		System.out.println(count);
		
//		AnyMatch, AllMatch, NonMatch
		
		Boolean b=students.stream()
		     .anyMatch(s -> s.getMarks()<500);
		
		System.out.println(b);
		
//		SummingInt
		
		int total=students.stream()
		         .collect(Collectors.summingInt(s -> s.getMarks()));
		
		System.out.println(total);
		
		
		
		
				      
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
