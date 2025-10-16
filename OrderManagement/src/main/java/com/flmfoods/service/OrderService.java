package com.flmfoods.service;


import com.flmfoods.dto.OrderRequestDto;
import com.flmfoods.dto.OrderResponseDto;

public interface OrderService {
    
	OrderResponseDto placeOrder(OrderRequestDto orderRequest);
	
	OrderResponseDto updateOrderStatus(long orderId, String status);

	String getRestaurantName(long restautrantId);
}
