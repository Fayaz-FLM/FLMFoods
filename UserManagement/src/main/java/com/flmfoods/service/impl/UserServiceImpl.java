package com.flmfoods.service.impl;


import org.springframework.stereotype.Service;

import com.flmfoods.dao.UserAddressRepository;
import com.flmfoods.dao.UserRepository;
import com.flmfoods.dto.UserAddressMapper;
import com.flmfoods.dto.UserAddressRequestDto;
import com.flmfoods.dto.UserMapper;
import com.flmfoods.dto.UserRequestDto;
import com.flmfoods.dto.UserResponseDto;
import com.flmfoods.dto.UserSignupDTO;
import com.flmfoods.model.User;
import com.flmfoods.model.UserAddress;
import com.flmfoods.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserAddressRepository userAddressRepository;
    
    public UserServiceImpl(UserRepository userRepository, UserAddressRepository userAddressRepository) {
    	this.userRepository = userRepository;
    	this.userAddressRepository = userAddressRepository;
    }
    
    public UserResponseDto signup(UserSignupDTO userSignupDTO) {
    	
		return null;
	}
    
    @Override
    public UserResponseDto addUser(UserRequestDto userRequestDTO) {
    	
        User user = UserMapper.toEntity(userRequestDTO);
        User savedUser = userRepository.save(user);
        return UserMapper.toResponseDTO(savedUser);
        
    }

	@Override
	public UserResponseDto addAddress(UserAddressRequestDto userAddressRequest, long id) {
		UserAddress userAddress = UserAddressMapper.toEntity(userAddressRequest);
		User userById = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found with id: " + id));
		userAddress.setUser(userById);
		userById.getUserAddress().add(userAddress);
		User savedUser = userRepository.save(userById);
		return UserMapper.toResponseDTO(savedUser);
	}

	

}
