package com.example15.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * File Name: Address.java
 * Entity: Address
 * Package: com.example15.domain
 * Author: pranayramteke
 * Date: 03/04/25
 * Description:
 */


@Entity
public class Address
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String houseNumber;
	private String street;
	private String city;
	private String zipCode;
	private String state;
	private String country;
	
	public Address() {
	}
	
	public Address(Long id, String houseNumber, String street, String city, String zipCode, String state, String country) {
		this.id = id;
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
		this.state = state;
		this.country = country;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getHouseNumber() {
		return houseNumber;
	}
	
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
}
