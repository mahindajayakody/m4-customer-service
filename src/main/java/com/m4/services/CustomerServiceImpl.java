package com.m4.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m4.entity.Customer;
import com.m4.repository.CustomerRepository;

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
    public Customer updateCustomer(Customer customer) throws Exception {

        Customer existingCustomer = customerRepository.findById(customer.getId()).get();
        if (existingCustomer != null) {
            existingCustomer.setFirstName(customer.getFirstName());
            existingCustomer.setLsatName(customer.getLsatName());
            existingCustomer.setMiddleName(customer.getMiddleName());
            existingCustomer.setBillingAddress(customer.getBillingAddress());
            existingCustomer.setMailingAddress(customer.getMailingAddress());
            return customerRepository.save(existingCustomer);
        }
        return null;
    }

    @Override
    public void deleteCustomer(Long customerId) throws Exception {
        customerRepository.deleteById(customerId);
    }

    @Override
    public Customer getCustomer(Long customerId) throws Exception {
        return customerRepository.findById(customerId).get();
    }

}
