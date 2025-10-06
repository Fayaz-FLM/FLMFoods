package com.flmfoods.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressResponseDto {
	
	private long addressId;
	
	private String landmark;
	
	private String city;
	
	private String pincode;
	
	private String state;

}
