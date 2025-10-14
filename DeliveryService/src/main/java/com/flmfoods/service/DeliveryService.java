package com.flmfoods.service;

import org.springframework.http.ResponseEntity;

import com.flmfoods.dto.DeliveryAssignmentRequestDto;
import com.flmfoods.dto.DeliveryPersonRequestDto;
import com.flmfoods.dto.DeliveryAssignmentResponseDto;
import com.flmfoods.dto.DeliveryPersonResponseDto;
import com.flmfoods.dto.OrderResponseDto;

public interface DeliveryService {

    DeliveryPersonResponseDto registerDeliveryPerson(DeliveryPersonRequestDto request);

    DeliveryAssignmentResponseDto assignOrderToDeliveryPerson(DeliveryAssignmentRequestDto request);
    
    ResponseEntity<OrderResponseDto> updateOrderStatus(long orderId, String status);
    
    public ResponseEntity<String> getRestaurantName(long restaurantId);
}

