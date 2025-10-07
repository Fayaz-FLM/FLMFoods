package com.flmfoods.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "restaurants")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Restaurant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long restaurantId;
	
	private String restaurantName;
	
	private String phoneNum;
	
	private double rating;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_Id")
	private Address address;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Item> items;

	public Restaurant(String restaurantName, String phoneNum, double rating, Address address, List<Item> items) {
		super();
		this.restaurantName = restaurantName;
		this.phoneNum = phoneNum;
		this.rating = rating;
		this.address = address;
		this.items = items;
	}
	
}
