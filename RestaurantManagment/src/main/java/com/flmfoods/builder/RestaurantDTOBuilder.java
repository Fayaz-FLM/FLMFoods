package com.flmfoods.builder;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.flmfoods.dto.AddressResponseDto;
import com.flmfoods.dto.ItemResponseDto;
import com.flmfoods.dto.RestaurantResponseDto;
import com.flmfoods.model.Address;
import com.flmfoods.model.Item;
import com.flmfoods.model.Restaurant;

public class RestaurantDTOBuilder {
	
	public static RestaurantResponseDto buildRestaurantRespDTOFromRestaurant(Restaurant restaurant) {
		
		return RestaurantResponseDto.builder()
						.restaurantId(restaurant.getRestaurantId())
						.restaurantName(restaurant.getRestaurantName())
						.rating(restaurant.getRating())
						.phoneNum(restaurant.getPhoneNum())
						.addressResponseDto(buildAddressRespDTO(restaurant.getAddress()))
						.itemResponseDtoList(buildItemRespDTOList(restaurant.getItems()))
						.build();
	}
	
	private static AddressResponseDto buildAddressRespDTO(Address address) {
		AddressResponseDto addressResponseDto = new AddressResponseDto();
		BeanUtils.copyProperties(address, addressResponseDto);
		return addressResponseDto;
	}
	
	private static List<ItemResponseDto> buildItemRespDTOList(List<Item> items){
		
		List<ItemResponseDto> itemResponseDtoList = new ArrayList<>(); 
		for(Item item : items) {
			ItemResponseDto itemResponseDto = new ItemResponseDto();
			BeanUtils.copyProperties(item, itemResponseDto);
			itemResponseDtoList.add(itemResponseDto);
		}
		return itemResponseDtoList;
	}

}
