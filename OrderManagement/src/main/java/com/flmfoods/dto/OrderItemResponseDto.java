package com.flmfoods.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemResponseDto {

	private long itemId;

	private int quantity;

	private double eachProductPrice;

	private double totalProductPrice;
}
