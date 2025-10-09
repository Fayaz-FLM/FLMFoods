package com.flmfoods.builder;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.flmfoods.dto.OrderItemResponseDto;
import com.flmfoods.dto.OrderResponseDto;
import com.flmfoods.model.Order;
import com.flmfoods.model.OrderItem;

public class OrderDTOBuilder {

	public static OrderResponseDto buildOrderRespDTOFromOrder(Order order) {
		return OrderResponseDto.builder()
			.orderId(order.getOrderId())
			.status(order.getStatus())
			.orderPrice(order.getOrderPrice())
			.orderItems(buildOrderItemResponseDtos(order.getOrderItems()))
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
	

}
