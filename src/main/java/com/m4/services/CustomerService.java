package com.m4.services;

import java.util.List;

import com.m4.entity.Customer;


public interface CustomerService {
    List<Customer> getCustomers() throws Exception;

    Customer saveCustomer(Customer customer) throws Exception;

    Customer updateCustomer(Customer customer) throws Exception;

    void deleteCustomer(Long customerId) throws Exception;

    Customer getCustomer(Long customerId) throws Exception;
}
