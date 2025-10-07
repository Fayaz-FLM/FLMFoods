package com.flmfoods.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAddressRequestDto {

	private String doorNumber;

	private String street;

	private String landmark;

	private String city;

	private String district;

	private String state;

	private String pincode;
}
