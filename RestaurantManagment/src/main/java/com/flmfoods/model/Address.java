package com.flmfoods.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "address")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long addressId;
	
	private String landmark;
	
	private String city;
	
	private String pincode;
	
	private String state;

	public Address(String landmark, String city, String pincode, String state) {
		super();
		this.landmark = landmark;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
	}
	
}
