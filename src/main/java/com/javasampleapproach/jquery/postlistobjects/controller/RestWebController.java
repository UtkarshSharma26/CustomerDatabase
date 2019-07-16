package com.javasampleapproach.jquery.postlistobjects.controller;

import java.util.ArrayList;
import java.util.List;

import com.javasampleapproach.jquery.postlistobjects.model.Customer;
import com.javasampleapproach.jquery.postlistobjects.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/customer")

public class RestWebController {

	List<Customer> cust = new ArrayList<Customer>();

	@GetMapping(value = "/all")
	public List<Customer> getResource(){
		return cust ;
	}
	@Autowired
	CustomerRepo customerRepo;
	@PostMapping(value="/save")
	public String postCustomer(@RequestBody List<Customer> customers){
		cust.addAll(customers);
		System.out.println("cust = " + cust);
		//customerRepo.save(customers);
		return "Post Successfully!";
	}

}