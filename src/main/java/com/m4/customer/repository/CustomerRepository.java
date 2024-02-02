package com.m4.customer.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.m4.customer.entity.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer,String>{    
}
