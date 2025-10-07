package com.flmfoods.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class RestaurantCreationResponse {
	
	private long restaurantId;
	
	private String restaurantName;

}
