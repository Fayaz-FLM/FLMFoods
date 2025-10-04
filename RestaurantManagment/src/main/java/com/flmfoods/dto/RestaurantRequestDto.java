package com.flmfoods.dto;

import java.util.List;

import lombok.Data;

@Data
public class RestaurantRequestDto {

	
	private String restaurantName;
	
	private String phoneNum;
	
	private AddressRequestDto addressRequestDto;
	
	private List<ItemRequestDTO> itemRequestDTOs;	
	
	
}
