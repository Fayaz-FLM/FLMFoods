package com.flmfoods.service.impl;


import org.springframework.stereotype.Service;

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
    
    public OrderServiceImpl(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	@Override
    public OrderResponseDto placeOrder(OrderRequestDto orderRequest) {
		
        Order order = OrderBuilder.buildOrderFromOrderDTO(orderRequest);
        
        Order savedOrder = orderRepository.save(order);
        
        return OrderDTOBuilder.buildOrderRespDTOFromOrder(savedOrder);
    }
}
