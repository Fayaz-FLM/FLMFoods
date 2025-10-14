package com.flmfoods.service.impl;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.flmfoods.builder.OrderBuilder;
import com.flmfoods.builder.OrderDTOBuilder;
import com.flmfoods.dao.OrderRepository;
import com.flmfoods.dto.OrderRequestDto;
import com.flmfoods.dto.OrderResponseDto;
import com.flmfoods.model.Order;
import com.flmfoods.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
    
    private final OrderRepository orderRepository;
    private final RestTemplate restTemplate;
    
    public OrderServiceImpl(OrderRepository orderRepository, RestTemplate restTemplate) {
		this.orderRepository = orderRepository;
		this.restTemplate = restTemplate;
	}

	@Override
    public OrderResponseDto placeOrder(OrderRequestDto orderRequest) {
		
        Order order = OrderBuilder.buildOrderFromOrderDTO(orderRequest);
        
        Order savedOrder = orderRepository.save(order);
        
        OrderResponseDto orderResponseDto = OrderDTOBuilder.buildOrderRespDTOFromOrder(savedOrder);
    	String restaurantName = fetchRestaurantName(order);
    	orderResponseDto.setRestaurantName(restaurantName);
    	return orderResponseDto;
    }

	@Override
	public OrderResponseDto updateOrderStatus(long orderId, String status) {
		
		Order order = orderRepository.findById(orderId)
						.orElseThrow(() -> new IllegalArgumentException("Order Not Found with Id : "+orderId));
		order.setStatus(status);
		
		orderRepository.save(order);
		
		OrderResponseDto orderResponseDto = OrderDTOBuilder.buildOrderRespDTOFromOrder(order);
	    String restaurantName = fetchRestaurantName(order);
	    orderResponseDto.setRestaurantName(restaurantName);
		return orderResponseDto;
	}
	
	private String fetchRestaurantName(Order order) {
		String restaurantName = restTemplate.getForObject("http://RestaurantManagement/restaurants/name/"+order.getRestaurantId(), String.class);
		return restaurantName;
	}
}
