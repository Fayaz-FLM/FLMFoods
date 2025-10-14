package com.flmfoods.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.flmfoods.dto.RestaurantCreationResponse;
import com.flmfoods.dto.RestaurantRequestDto;

@FeignClient(name = "RestaurantManagement")
public interface RestaurantClient {
	
	@GetMapping("/restaurants/name/{restaurantId}")
	public ResponseEntity<String> getRestaurantNameById(@PathVariable(name = "restaurantId") long restaurantId);
	
	@PostMapping("/restaurants/add")
	public ResponseEntity<RestaurantCreationResponse> addRestaurant(@RequestBody RestaurantRequestDto restaurantRequestDto);
	
}
