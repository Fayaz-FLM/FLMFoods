package com.flmfoods.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDto {

	private long userId;

	private String userName;

	private String phoneNum;

	private String email;

	private String landmark;

	private String pincode;

}
