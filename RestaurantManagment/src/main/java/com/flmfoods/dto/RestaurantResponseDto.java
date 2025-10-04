package com.flmfoods.dto;

import java.util.List;

import lombok.Data;

@Data
public class RestaurantResponseDto {

	private long restaurantId;
	
	private String restaurantName;
	
	private String phoneNum;

	private AddressResponseDto addResponseDto;

	private List<ItemResponseDto> itResponseDtos;	
	
}
