package com.flmfoods.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemRequestDto {
	
	private String itemName;
	
	private double itemPrice;
	
	private String itemType;
	
	private String itemCategory;

}
