package com.m4.customer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m4.customer.entity.Customer;
import com.m4.customer.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customer> getCustomers() throws Exception {
        return customerRepository.findAll();
    }

    @Override
    public Customer saveCustomer(Customer customer) throws Exception {
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(String customerId,Customer customer) throws Exception {

        Customer existingCustomer = customerRepository.findById(customerId).get();
        if (existingCustomer != null) {
            existingCustomer.setFirstName(customer.getFirstName());
            existingCustomer.setLastName(customer.getLastName());
            existingCustomer.setMiddleName(customer.getMiddleName());
            existingCustomer.setBillingAddress(customer.getBillingAddress());
            existingCustomer.setMailingAddress(customer.getMailingAddress());
            return customerRepository.save(existingCustomer);
        }
        return null;
    }

    @Override
    public void deleteCustomer(String customerId) throws Exception {
        customerRepository.deleteById(customerId);
    }

    @Override
    public Customer getCustomer(String customerId) throws Exception {
        return customerRepository.findById(customerId).get();
    }

}
