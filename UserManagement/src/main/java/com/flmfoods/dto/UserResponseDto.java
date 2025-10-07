package com.flmfoods.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDto {
    private long userId;
    private String userName;
    private String phoneNum;
    private String email;
    private List<UserAddressResponseDto> userAddress;
}
