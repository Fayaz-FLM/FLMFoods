package com.flmfoods.service;

import com.flmfoods.dto.UserAddressRequestDto;
import com.flmfoods.dto.UserAddressResponseDto;
import com.flmfoods.dto.UserRequestDto;
import com.flmfoods.dto.UserResponseDto;

public interface UserService {
	
	public UserResponseDto addUser(UserRequestDto userRequestDTO);
	
	public UserResponseDto addAddress(UserAddressRequestDto userAddressRequest,long id);
}
