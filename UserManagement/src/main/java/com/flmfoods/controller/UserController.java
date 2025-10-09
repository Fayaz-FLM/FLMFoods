package com.flmfoods.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flmfoods.dto.UserAddressRequestDto;
import com.flmfoods.dto.UserAddressResponseDto;
import com.flmfoods.dto.UserRequestDto;
import com.flmfoods.dto.UserResponseDto;
import com.flmfoods.dto.UserSignupDTO;
import com.flmfoods.service.impl.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {
	
	private final UserServiceImpl userService;
	
	public UserController(UserServiceImpl userService) {
		this.userService = userService;
	}
	
	@PostMapping("/signup")
	public ResponseEntity<UserResponseDto> addUser(@RequestBody UserSignupDTO userSignupDTO){
		UserResponseDto savedUserResponse = userService.signup(userSignupDTO);
		return ResponseEntity.status(HttpStatus.CREATED).body(savedUserResponse);
	}
	
	@PostMapping("/{userId}/addAddress")
	public ResponseEntity<UserResponseDto> addAddress(@RequestBody UserAddressRequestDto userAddressRequest, @PathVariable("userId") long id){
		UserResponseDto userResponse = userService.addAddress(userAddressRequest, id);
		return ResponseEntity.status(HttpStatus.CREATED).body(userResponse);
	}
	
}
