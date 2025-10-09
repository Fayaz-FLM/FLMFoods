package com.flmfoods.service;

import org.springframework.http.ResponseEntity;

import com.flmfoods.dto.OrderRequestDto;
import com.flmfoods.dto.OrderResponseDto;
import com.flmfoods.dto.RestaurantCreationResponse;
import com.flmfoods.dto.RestaurantRequestDto;
import com.flmfoods.dto.RestaurantResponseDto;

public interface RestaurantService {
	
	RestaurantCreationResponse addRestaurant(RestaurantRequestDto restaurantRequestDto);
	
	RestaurantResponseDto getRestaurantById(long restaurantId);

	ResponseEntity<OrderResponseDto> placeOrder(OrderRequestDto orderRequestDTO);

}
