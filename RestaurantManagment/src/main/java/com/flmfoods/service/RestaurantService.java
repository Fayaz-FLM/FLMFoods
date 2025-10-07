package com.flmfoods.service;

import com.flmfoods.dto.RestaurantCreationResponse;
import com.flmfoods.dto.RestaurantRequestDto;

public interface RestaurantService {
	
	RestaurantCreationResponse addRestaurant(RestaurantRequestDto restaurantRequestDto);

}
