package com.flmfoods.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAddressResponseDto {
    private long userAddressId;
    private String doorNo;
    private String street;
    private String landmark;
    private String city;
    private String district;
    private String state;
    private String pincode;
    private String addressType;
}
