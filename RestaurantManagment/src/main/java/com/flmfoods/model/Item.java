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
@Table(name = "items")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long itemId;
	
	private String itemName;
	
	private double itemPrice;
	
	private double itemRating;
	
	private boolean isItemAvailable;
	
	private String itemType;
	
	private String itemCategory;

	public Item(String itemName, double itemPrice, double itemRating, boolean isItemAvailable, String itemType,
			String itemCategory) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemRating = itemRating;
		this.isItemAvailable = isItemAvailable;
		this.itemType = itemType;
		this.itemCategory = itemCategory;
	}
	
}
