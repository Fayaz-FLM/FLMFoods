package com.flmfoods.dto;


import lombok.Data;

@Data
public class ItemRequestDTO {
	
	
	private String itemName;
	
	private double itemPrice;
	
	private String itemType;
	
	private String itemCategory; //veg or non-veg
	
	private RestaurantRequestDto restaurantRequestDto;	

}
