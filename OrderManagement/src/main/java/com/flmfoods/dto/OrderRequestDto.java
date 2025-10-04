package com.flmfoods.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequestDto {
	
	private long userId;
	private long restaurantId;
	private List<OrderItemsDto> orderItemsDto;
	private double price;

}
