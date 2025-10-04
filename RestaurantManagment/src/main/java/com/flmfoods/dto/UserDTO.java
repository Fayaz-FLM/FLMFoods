package com.flmfoods.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
	
	private long userId;
	
	private String userName;
	
	private String email;
	
	private int userPhoneNumber;
	
	private List<AddressDTO> Addresses;
	

}
