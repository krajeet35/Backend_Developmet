package com._204;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Nio4 {

	public static void main(String[] args) throws IOException {
		Path p= Paths.get("file3.txt");
		
		Stream<String> st= Files.lines(p);
		
		st.map(l -> {
			if(l.contains("Delhi")) {
				return l.replace("Delhi", "Capital");
			}
			else {
				return l;
			}
		}).forEach(l -> System.out.println(l));

	}

}
