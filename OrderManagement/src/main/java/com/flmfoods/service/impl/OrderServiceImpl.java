package com.flmfoods.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.flmfoods.dto.OrderRequestDto;
import com.flmfoods.dto.OrderResponseDto;
import com.flmfoods.dto.OrderMapper;
import com.flmfoods.model.Order;
import com.flmfoods.dao.OrderRepository;
import com.flmfoods.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public OrderResponseDto placeOrder(OrderRequestDto orderRequest) {
        Order order = OrderMapper.toEntity(orderRequest);
        Order savedOrder = orderRepository.save(order);
        return OrderMapper.toResponseDto(savedOrder);
    }
}
