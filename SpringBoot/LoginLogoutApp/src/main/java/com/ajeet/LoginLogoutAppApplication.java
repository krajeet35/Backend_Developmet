package com.ajeet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@OpenAPIDefinition(
		info=@Info(
	     title="Login and Logout System",
		version="1.0.0",
		description="Customer signup,login, logout RESTfull webservices api",
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
public class LoginLogoutAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginLogoutAppApplication.class, args);
	}
	
	@Bean
	public LocalValidatorFactoryBean validator(MessageSource ms) {
		LocalValidatorFactoryBean lvfb= new LocalValidatorFactoryBean();
		lvfb.setValidationMessageSource(ms);
		return lvfb;
	}

}
