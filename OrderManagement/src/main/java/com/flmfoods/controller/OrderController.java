package com.flmfoods.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flmfoods.dto.OrderRequestDto;
import com.flmfoods.dto.OrderResponseDto;
import com.flmfoods.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	private final OrderService orderService;
	
	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}
	
	@PostMapping
	public ResponseEntity<OrderResponseDto> placeOrder(@RequestBody OrderRequestDto orderRequest){
		OrderResponseDto placedOrder = orderService.placeOrder(orderRequest);
		return ResponseEntity.status(HttpStatus.CREATED).body(placedOrder);
	}
	
	@PutMapping("/status/{orderId}")
	public ResponseEntity<OrderResponseDto> updateOrderStatus(@PathVariable(name = "orderId") long orderId,@RequestParam(name = "status") String status){
		OrderResponseDto orderResponseDto = orderService.updateOrderStatus(orderId, status);
		return ResponseEntity.ok(orderResponseDto);
	}

}
