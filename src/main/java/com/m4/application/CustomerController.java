package com.m4.application;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Customer;



@RestController
public class CustomerController {

	@GetMapping("/customers")
	public String getCustomers() {
		return "Greetings from Spring Boot!";
	}

	@PostMapping("/customers")
	public List<Customer> postMethodName() {
		return null;
	}
	@GetMapping("/customers/{customerId}")
	public Customer getMethodName(@RequestParam String customerId) {
		return new Customer();
	}
	
	

}
