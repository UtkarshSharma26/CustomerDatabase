package com.javasampleapproach.jquery.postlistobjects.repository;

import com.javasampleapproach.jquery.postlistobjects.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepo extends MongoRepository<Customer,String> {
}
