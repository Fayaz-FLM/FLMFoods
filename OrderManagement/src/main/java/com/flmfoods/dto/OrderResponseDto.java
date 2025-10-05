package com.flmfoods.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponseDto {
	private long orderId;
	private long userId;
	private long restaurantId;
	private String status;
	private List<OrderItemsDto> orderItemsDto;
	private double price;
}
