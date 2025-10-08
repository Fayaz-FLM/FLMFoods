package com.flmfoods.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderRequestDto {

    private double orderPrice;
    
    private long userId;
    
    private long restaurantId;
    
    private List<OrderItemRequestDto> orderItems;
}

