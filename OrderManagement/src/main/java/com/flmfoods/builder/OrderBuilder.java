package com.flmfoods.builder;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.flmfoods.dto.OrderItemRequestDto;
import com.flmfoods.dto.OrderRequestDto;
import com.flmfoods.model.Order;
import com.flmfoods.model.OrderItem;

public class OrderBuilder {

    public static Order buildOrderFromOrderDTO(OrderRequestDto orderRequestDto) {
        return Order.builder()
        	.status("Ordered")
        	.orderPrice(orderRequestDto.getOrderPrice())
        	.userId(orderRequestDto.getUserId())
        	.restaurantId(orderRequestDto.getRestaurantId())
        	.orderItems(buildOrderItemsFromDTO(orderRequestDto.getOrderItems()))
        	.build();
        	
    }
    
    private static List<OrderItem> buildOrderItemsFromDTO(List<OrderItemRequestDto> orderItemRequestDtoList) {
    	List<OrderItem> orderItemsList = new ArrayList<>();
    	
    	for(OrderItemRequestDto orderItemRequestDto : orderItemRequestDtoList) {
    		OrderItem orderItem = new OrderItem();
    		BeanUtils.copyProperties(orderItemRequestDto, orderItem);
    		orderItemsList.add(orderItem);
    	}
    	return orderItemsList;
    }

}

