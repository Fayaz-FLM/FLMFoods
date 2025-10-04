package com.flmfoods.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantResponseDto {

	private long restaurantId;
	
	private String restaurantName;
	
	private String phoneNum;

	private AddressResponseDto addResponseDto;

	private List<ItemResponseDto> itResponseDtos;	
	
}
