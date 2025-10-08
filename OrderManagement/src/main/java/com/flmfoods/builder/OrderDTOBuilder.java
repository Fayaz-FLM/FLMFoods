package com.flmfoods.builder;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.web.client.RestTemplate;

import com.flmfoods.dto.OrderItemResponseDto;
import com.flmfoods.dto.OrderResponseDto;
import com.flmfoods.model.Order;
import com.flmfoods.model.OrderItem;

public class OrderDTOBuilder {
	
	private final RestTemplate restTemplate;
	
	public OrderDTOBuilder(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	public OrderDTOBuilder() {
		this.restTemplate = new RestTemplate();
	}
	

	public static OrderResponseDto buildOrderRespDTOFromOrder(Order order) {
		OrderDTOBuilder orderDTOBuilder = new OrderDTOBuilder();
		return OrderResponseDto.builder()
			.orderId(order.getOrderId())
			.status(order.getStatus())
			.orderPrice(order.getOrderPrice())
			.orderItems(buildOrderItemResponseDtos(order.getOrderItems()))
			.restaurantName(orderDTOBuilder.fetchRestaurantNameFromId(order.getRestaurantId()))
			.build();
				
	}
	
	private static List<OrderItemResponseDto> buildOrderItemResponseDtos(List<OrderItem> orderItems){
		List<OrderItemResponseDto> orderItemResponseDtoList = new ArrayList<>();
		
		for(OrderItem orderItem : orderItems) {
			OrderItemResponseDto orderItemResponseDto = new OrderItemResponseDto();
			BeanUtils.copyProperties(orderItem, orderItemResponseDto);
			orderItemResponseDtoList.add(orderItemResponseDto);
		}
		return orderItemResponseDtoList;
	}
	
	private String fetchRestaurantNameFromId(long restaurantId) {
		String name = restTemplate.getForObject("http://localhost:8002/restaurants/name/"+restaurantId, String.class);
		return name;
	}

}
