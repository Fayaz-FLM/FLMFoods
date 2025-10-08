package com.flmfoods.service;

import com.flmfoods.dto.RestaurantCreationResponse;
import com.flmfoods.dto.RestaurantRequestDto;
import com.flmfoods.dto.RestaurantResponseDto;

public interface RestaurantService {
	
	RestaurantCreationResponse addRestaurant(RestaurantRequestDto restaurantRequestDto);
	
	RestaurantResponseDto getRestaurantById(long restaurantId);

}
