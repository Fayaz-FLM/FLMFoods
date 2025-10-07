package com.flmfoods.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flmfoods.dto.OrderRequestDto;
import com.flmfoods.dto.OrderResponseDto;
import com.flmfoods.service.impl.OrderServiceImpl;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	private final OrderServiceImpl orderService;
	
	public OrderController(OrderServiceImpl orderService) {
		this.orderService = orderService;
		
	}
	
	@PostMapping("/placeOrder")
	public ResponseEntity<OrderResponseDto> placeOrder(@RequestBody OrderRequestDto orderRequest){
		OrderResponseDto placedOrder = orderService.placeOrder(orderRequest);
		return ResponseEntity.status(HttpStatus.CREATED).body(placedOrder);
	}
}
