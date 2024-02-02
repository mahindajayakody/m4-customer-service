package com.m4.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.m4.entity.Customer;
import com.m4.services.CustomerService;

@RestController
@RequestMapping("api")
public class CustomerController {
	@Autowired
	CustomerService customerService;

	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> getCustomers(@RequestParam String param) {
		List<Customer> customers = null;
		try {
			customers = customerService.getCustomers();
		} catch (Exception e) {
			return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity< >(customers,HttpStatus.OK);
	}

	@PostMapping("/customers")
	public List<Customer> postMethodName() {
		return null;
	}

	@GetMapping("/customers/{customerId}")
	public Customer getMethodName(@PathVariable String customerId) {
		return new Customer("","");
	}

	@PutMapping("/customers/{customerId}")
	public Customer putMethodName(@PathVariable String customerId, @RequestBody Customer customer) {
		// TODO: process PUT request

		return null;
	}
}
