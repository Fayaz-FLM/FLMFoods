package com.flmfoods.service;

import com.flmfoods.dto.DeliveryAssignmentRequestDto;
import com.flmfoods.dto.DeliveryPersonRequestDto;
import com.flmfoods.dto.DeliveryAssignmentResponseDto;
import com.flmfoods.dto.DeliveryPersonResponseDto;

public interface DeliveryService {

    DeliveryPersonResponseDto registerDeliveryPerson(DeliveryPersonRequestDto request);

    DeliveryAssignmentResponseDto assignOrderToDeliveryPerson(DeliveryAssignmentRequestDto request);
}

