package com.flmfoods.service.impl;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.flmfoods.dto.*;
import com.flmfoods.model.*;
import com.flmfoods.service.UserService;
import com.flmfoods.dao.*;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserAddressRepository userAddressRepository;
    
    public UserServiceImpl(UserRepository userRepository, UserAddressRepository userAddressRepository) {
    	this.userRepository = userRepository;
    	this.userAddressRepository = userAddressRepository;
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
