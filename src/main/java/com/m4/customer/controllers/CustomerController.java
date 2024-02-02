package com.m4.customer.controllers;

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
import org.springframework.web.bind.annotation.RestController;

import com.m4.customer.entity.Customer;
import com.m4.customer.services.CustomerService;
import com.m4.customer.utils.ResponseHandler;


@RestController
@RequestMapping("/api")
public class CustomerController {
	@Autowired
	CustomerService customerService;

	@GetMapping("/customers")
	public ResponseEntity<Object> getCustomers() {
		List<Customer> customers = null;
		try {
			customers = customerService.getCustomers();
		} catch (Exception e) {
			return ResponseHandler.buildResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST, e);
		}
		return ResponseHandler.buildResponseEntity("", HttpStatus.OK, customers);
	}

	@PostMapping("/customers")
	public ResponseEntity<Object> createCustomer(@RequestBody Customer customer) {
		try {
			return ResponseHandler.buildResponseEntity(
				"Customer Successfully created.", 
				HttpStatus.OK, 
				customerService.saveCustomer(customer));
		} catch (Exception e) {
			return ResponseHandler.buildResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR,e);
		}
	}

	@GetMapping("/customers/{customerId}")
	public ResponseEntity<Object> getCustomer(@PathVariable String customerId,@RequestBody Customer customer) {
		try {
			;
			return ResponseHandler.buildResponseEntity(
				"", 
			HttpStatus.OK,
			customerService.getCustomer(customerId));
		} catch (Exception e) {
			return ResponseHandler.buildResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR,e);
		}
	}

	@PutMapping("/customers/{customerId}")
	public ResponseEntity<Object> updateCustomer(@PathVariable String customerId, @RequestBody Customer customer) {
		try {
			return ResponseHandler.buildResponseEntity(
				"Customer Successfully Updated.", 
				HttpStatus.OK, 
				customerService.updateCustomer(customerId,customer));
		} catch (Exception e) {
			return ResponseHandler.buildResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR,e);
		}
	}
}
