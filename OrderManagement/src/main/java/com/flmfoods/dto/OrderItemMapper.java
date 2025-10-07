package com.flmfoods.dto;


import com.flmfoods.dto.OrderItemRequestDto;
import com.flmfoods.dto.OrderItemResponseDto;
import com.flmfoods.model.OrderItem;

public class OrderItemMapper {

    public static OrderItem toEntity(OrderItemRequestDto dto) {
        OrderItem item = new OrderItem();
        item.setItemId(dto.getItemId());
        item.setQuantity(dto.getQuantity());
        return item;
    }

    public static OrderItemResponseDto toResponseDto(OrderItem entity) {
        return new OrderItemResponseDto(
                entity.getOrderItemId(),
                entity.getItemId(),
                entity.getQuantity()
        );
    }
}

