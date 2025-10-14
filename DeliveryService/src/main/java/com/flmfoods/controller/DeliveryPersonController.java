package com.flmfoods.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flmfoods.dto.DeliveryPersonRequestDto;
import com.flmfoods.dto.DeliveryPersonResponseDto;
import com.flmfoods.dto.OrderResponseDto;
import com.flmfoods.dto.RestaurantCreationResponse;
import com.flmfoods.dto.RestaurantRequestDto;
import com.flmfoods.service.impl.DeliveryServiceImpl;

@RestController
@RequestMapping("/delivery")
public class DeliveryPersonController {
	
	private final DeliveryServiceImpl deliveryService;
	
	public DeliveryPersonController(DeliveryServiceImpl deliveryService) {
		this.deliveryService = deliveryService;
	}
	
	@PostMapping("/registerDeliveryPerson")
	public ResponseEntity<DeliveryPersonResponseDto> registerDeliveryPerson(@RequestBody DeliveryPersonRequestDto deliveryPersonRequestDto){
		
		DeliveryPersonResponseDto deliveryResponse =  deliveryService.registerDeliveryPerson(deliveryPersonRequestDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(deliveryResponse);
	}
	
	@PutMapping("/orderstatus/{orderId}")
	public ResponseEntity<OrderResponseDto> updateOrderStatus(@PathVariable(name = "orderId") long orderId,@RequestParam(name = "status") String status){
		return deliveryService.updateOrderStatus(orderId, status);
	}
	
	@GetMapping("/restaurant-name/{restaurantId}")
	public ResponseEntity<String> getRestaurantName(@PathVariable(name = "restaurantId") long restaurantId) {
		return deliveryService.getRestaurantName(restaurantId);
	}
	
	@PostMapping("/add-restaurant")
	public ResponseEntity<RestaurantCreationResponse> addRestaurant(@RequestBody RestaurantRequestDto restaurantRequestDto){
		return deliveryService.addRestaurant(restaurantRequestDto);
	}
}
