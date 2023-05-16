package com._204;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class Nio3 {

	public static void main(String[] args) throws IOException {
		
		Path p= Paths.get("file3.txt");
		
		List<String> l1= Files.readAllLines(p);
		
		for(String s:l1) {
			System.out.println(s);
		}
		
//		Using Stream
		Stream<String> s1= Files.lines(p);
		
		s1.forEach(s -> System.out.println(s));
		

	}

}
