package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.entity.Customer;
import com.repository.CustomerRepository;

public class CustomerService {
    @Autowired CustomerRepository customerRepository;
    public List<Customer> getCustomers() throws Exception{
        return (List<Customer>) customerRepository.findAll();
    }
    public Customer saveCustomer(Customer customer) throws Exception{
        return customerRepository.save(customer);
    }
}
