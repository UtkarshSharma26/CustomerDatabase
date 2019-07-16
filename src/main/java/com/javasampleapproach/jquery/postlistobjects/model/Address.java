package com.javasampleapproach.jquery.postlistobjects.model;

import org.springframework.data.annotation.Id;

public class Address {
	@Id
	private String id;
	private String street;
	private String postcode;
	
	public Address(){

	}
	
	public Address(String id, String street, String postcode){
		this.id = id;
		this.street = street;
		this.postcode = postcode;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}
 
	public void setStreet(String street) {
		this.street = street;
	}
 
	public String getPostcode() {
		return postcode;
	}
 
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
 
	@Override
	public String toString() {
		return "Address {street:" + street + ", postcode:" + postcode + "}";
	}
}
