package com.flmfoods.service;

import com.flmfoods.dto.UserAddressRequestDto;
import com.flmfoods.dto.UserRequestDto;
import com.flmfoods.dto.UserResponseDto;
import com.flmfoods.dto.UserSignupDTO;

public interface UserService {
	
	public UserResponseDto addUser(UserRequestDto userRequestDTO);
	
	public UserResponseDto addAddress(UserAddressRequestDto userAddressRequest,long id);
	
	public UserResponseDto signup(UserSignupDTO userSignupDTO);
}
