package com.flmfoods.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderResponseDto {
    private long orderId;
    private String status;
    private double orderPrice;
    private long userId;
    private long restaurantId;
    private List<OrderItemResponseDto> orderItems;
}

