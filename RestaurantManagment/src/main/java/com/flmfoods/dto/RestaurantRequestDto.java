package com.flmfoods.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantRequestDto {
	
	private String restaurantName;
	
	private String phoneNum;
	
	private AddressRequestDto addressRequestDto;
	
	private List<ItemRequestDto> itemRequestDtoList;

}
