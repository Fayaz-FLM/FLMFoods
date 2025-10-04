package com.flmfoods.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemRequestDTO {
	
	
	private String itemName;
	
	private double itemPrice;
	
	private String itemType;
	
	private String itemCategory; //veg or non-veg
	
	private RestaurantRequestDto restaurantRequestDto;	

}
