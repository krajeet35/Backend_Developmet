package com.ajeet.utility;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.ajeet.annotationMisc.A;
import com.ajeet.annotationMisc.Student;

@Configuration
@ComponentScan(basePackages = {"com.ajeet"})
@PropertySource("a1.properties")
public class AppConfig {
	@Bean("a1")
	public A getA() {
		A a1= new A();
		
		return a1;
	}
	@Bean
	public List<String> getCity(){
		List<String> city= new ArrayList<>();
		city.add("Surat");
		city.add("Patna");
		
		return city;
	}
	@Bean
	public Student getStudent() {
		Student s1= new Student("Ajeet", 500);
		return s1;
	}

}
