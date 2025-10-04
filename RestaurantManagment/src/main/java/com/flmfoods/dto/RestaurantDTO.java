package com.flmfoods.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantDTO {
	
	private long restraurantId;
	
	private String  name;
	
	private String address;
	
	private List<ItemDTO> items;

}
