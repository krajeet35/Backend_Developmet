package com.ajeet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer customerId;
	@Size(min=3, message="{name.invalid}")
	private String  name;
	@Size(min=10, max=10, message="{mobile.invalid}")
	private String mobileNo;
	@Size(min=5, message= "{passwordMin.invalid}")
	private String password;
	@Email
	private String email;

}
 