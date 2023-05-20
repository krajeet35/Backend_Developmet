package com.ajeet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;


@SpringBootApplication
@OpenAPIDefinition(
		info=@Info(
	     title="Student Course Management api",
		version="1.0.0",
		description="My first RESTfull webservices api",
		termsOfService="runcodenow",
		contact=@Contact(
				name="Ajeet kumar",
				url = "https://krajeet35.github.io/"
				),
		license=@License(
				name="license",
				url="runcodenow"
				)
		
		   )
		)
public class SpringDataJpaRelationship2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaRelationship2Application.class, args);
	}

}
