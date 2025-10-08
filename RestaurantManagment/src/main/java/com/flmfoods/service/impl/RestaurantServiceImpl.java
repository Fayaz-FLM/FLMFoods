package com.flmfoods.service.impl;

import org.springframework.stereotype.Service;

import com.flmfoods.builder.RestaurantBuilder;
import com.flmfoods.builder.RestaurantDTOBuilder;
import com.flmfoods.dao.RestaurantRepository;
import com.flmfoods.dto.RestaurantCreationResponse;
import com.flmfoods.dto.RestaurantRequestDto;
import com.flmfoods.dto.RestaurantResponseDto;
import com.flmfoods.model.Restaurant;
import com.flmfoods.service.RestaurantService;

@Service
public class RestaurantServiceImpl implements RestaurantService{
	
	private final RestaurantRepository restaurantRepository;
	
	public RestaurantServiceImpl(RestaurantRepository restaurantRepository) {
		this.restaurantRepository = restaurantRepository;
	}
	
	@Override
	public RestaurantCreationResponse addRestaurant(RestaurantRequestDto restaurantRequestDto) {
		Restaurant restaurant = RestaurantBuilder.buildRestaurantFromRestaurantDTO(restaurantRequestDto);
		
		Restaurant savedRestaurant = restaurantRepository.save(restaurant);
		return new RestaurantCreationResponse(savedRestaurant.getRestaurantId(), savedRestaurant.getRestaurantName());
	}

	@Override
	public RestaurantResponseDto getRestaurantById(long restaurantId) {
		
		Restaurant restaurant = restaurantRepository.findById(restaurantId)
								.orElseThrow(() -> new IllegalArgumentException("No restaurant found with Id : "+restaurantId));
		return RestaurantDTOBuilder.buildRestaurantRespDTOFromRestaurant(restaurant);
	}
	
}
