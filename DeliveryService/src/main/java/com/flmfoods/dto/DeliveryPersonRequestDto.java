package com.flmfoods.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryPersonRequestDto {
    private String deliveryPersonName;
    private String aadharNum;
    private String phoneNum;
    private String email;
    private boolean isAvailable;
    private double rating;
}

