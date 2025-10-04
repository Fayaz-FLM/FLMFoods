package com.flmfoods.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemResponseDto {

	
	private String itemName;
	
	private double itemPrice;
	
	private boolean isItemAvailable;
	
	private String itemType;
	
	private String itemCategory;

	private RestaurantResponseDto restaurantResponseDto;	

}
