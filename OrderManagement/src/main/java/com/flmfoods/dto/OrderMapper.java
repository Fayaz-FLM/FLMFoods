package com.flmfoods.dto;


import java.util.List;
import java.util.stream.Collectors;

import com.flmfoods.dto.OrderRequestDto;
import com.flmfoods.dto.OrderResponseDto;
import com.flmfoods.model.Order;
import com.flmfoods.model.OrderItem;

public class OrderMapper {

    public static Order toEntity(OrderRequestDto dto) {
        Order order = new Order();
        order.setStatus(dto.getStatus());
        order.setOrderPrice(dto.getOrderPrice());
        order.setUserId(dto.getUserId());
        order.setRestaurantId(dto.getRestaurantId());

        if (dto.getOrderItems() != null) {
            List<OrderItem> items = dto.getOrderItems()
                    .stream()
                    .map(OrderItemMapper::toEntity)
                    .collect(Collectors.toList());
            items.forEach(item -> item.setOrder(order)); // maintain bidirectional relation
            order.setOrderItems(items);
        }
        return order;
    }

    public static OrderResponseDto toResponseDto(Order order) {
        return new OrderResponseDto(
                order.getOrderId(),
                order.getStatus(),
                order.getOrderPrice(),
                order.getUserId(),
                order.getRestaurantId(),
                order.getOrderItems() != null
                        ? order.getOrderItems().stream()
                            .map(OrderItemMapper::toResponseDto)
                            .collect(Collectors.toList())
                        : null
        );
    }
}

