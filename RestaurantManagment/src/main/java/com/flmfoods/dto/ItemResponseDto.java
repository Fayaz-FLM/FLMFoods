package com.flmfoods.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemResponseDto {
	
	private long itemId;
	
	private String itemName;
	
	private double itemPrice;
	
	private double itemRating;
	
	private boolean isItemAvailable;
	
	private String itemType;
	
	private String itemCategory;
	
	

}
