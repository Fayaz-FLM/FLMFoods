package com.flmfoods.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestDto {
    private String userName;
    private String phoneNum;
    private String email;
    private String password;
    private List<UserAddressRequestDto> userAddress;
}
