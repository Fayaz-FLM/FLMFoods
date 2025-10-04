package com.flmfoods.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemsResponseDto {
	private long id;
	private long orderedItemId;
	private long quantity;
}
