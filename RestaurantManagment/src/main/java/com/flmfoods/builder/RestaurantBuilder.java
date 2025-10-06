package com.flmfoods.builder;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.flmfoods.dto.AddressRequestDto;
import com.flmfoods.dto.ItemRequestDto;
import com.flmfoods.dto.RestaurantRequestDto;
import com.flmfoods.model.Address;
import com.flmfoods.model.Item;
import com.flmfoods.model.Restaurant;

public class RestaurantBuilder {
	
	public static Restaurant buildRestaurantFromRestaurantDTO(RestaurantRequestDto restaurantRequestDto) {
		return Restaurant.builder()
					.restaurantName(restaurantRequestDto.getRestaurantName())
					.phoneNum(restaurantRequestDto.getPhoneNum())
					.address(buildAddressFromAddressDTO(restaurantRequestDto.getAddressRequestDto()))
					.items(buildItemsFromItemsDTO(restaurantRequestDto.getItemRequestDtoList()))
					.build();
	}
	
	private static Address buildAddressFromAddressDTO(AddressRequestDto addressRequestDto) {
		Address address = new Address();
		BeanUtils.copyProperties(addressRequestDto, address);
		return address;
	}
	
	private static List<Item> buildItemsFromItemsDTO(List<ItemRequestDto> itemRequestDtos){
		List<Item> items = new ArrayList<>();
		
		for(ItemRequestDto itemRequestDto : itemRequestDtos) {
			Item item = new Item();
			BeanUtils.copyProperties(itemRequestDto, item);
			items.add(item);
		}
		return items;
	}

}
