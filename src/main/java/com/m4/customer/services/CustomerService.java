package com.m4.customer.services;

import java.util.List;

import com.m4.customer.entity.Customer;

public interface CustomerService {
    List<Customer> getCustomers() throws Exception;

    Customer saveCustomer(Customer customer) throws Exception;

    Customer updateCustomer(String customerId,Customer customer) throws Exception;

    void deleteCustomer(String customerId) throws Exception;

    Customer getCustomer(String customerId) throws Exception;
}
