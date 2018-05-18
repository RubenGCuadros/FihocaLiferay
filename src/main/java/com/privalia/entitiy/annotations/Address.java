package com.privalia.entitiy.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("address")
public class Address {
	private int idAddress;
	private String street;
	
	public int getIdAddress() {
		return idAddress;
	}
	
	@Autowired
	@Value("1")
	public void setIdAddress(int idAddress) {
		this.idAddress = idAddress;
	}
	
	public String getStreet() {
		return street;
	}
	
	@Autowired
	@Value("Calle Industria")
	public void setStreet(String street) {
		this.street = street;
	}
	
	public Address() {
		
	}
	
	public Address(int idAddress, String street) {
		super();
		this.idAddress = idAddress;
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [idAddress=" + idAddress + ", street=" + street + "]";
	}
}

