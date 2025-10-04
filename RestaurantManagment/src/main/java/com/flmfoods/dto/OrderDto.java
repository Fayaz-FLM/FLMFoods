package com.flmfoods.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
	
	private int orderId;
	
	private int userId;
	
	private int restraurantId;
	
	private List<ItemDTO> items;
	
	private String status;

}
