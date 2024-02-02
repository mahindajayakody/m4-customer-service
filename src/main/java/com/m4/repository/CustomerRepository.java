package com.m4.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.m4.entity.Customer;



// @RepositoryRestResource(collectionResourceRel = "customer",path ="customer")
@Repository
public interface CustomerRepository extends MongoRepository<Customer,Long>{    
}
