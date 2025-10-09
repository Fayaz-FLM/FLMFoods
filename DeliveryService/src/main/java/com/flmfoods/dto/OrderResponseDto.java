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
public class OrderResponseDto {
	
    private long orderId;
    
    private String status;
    
    private double orderPrice;
    
    private String restaurantName;
    
    private List<OrderItemResponseDto> orderItems;
}

