package com.flmfoods.dto;

import com.flmfoods.dto.DeliveryAssignmentRequestDto;
import com.flmfoods.dto.DeliveryAssignmentResponseDto;
import com.flmfoods.model.DeliveryAssignment;
import com.flmfoods.model.DeliveryPerson;

public class DeliveryAssignmentMapper {

    public static DeliveryAssignment toEntity(DeliveryAssignmentRequestDto dto, DeliveryPerson person) {
        DeliveryAssignment da = new DeliveryAssignment();
        da.setStatus(dto.getStatus());
        da.setAssignedTime(dto.getAssignedTime());
        da.setOrderId(dto.getOrderId());
        da.setDeliveryPerson(person);
        return da;
    }

    public static DeliveryAssignmentResponseDto toResponseDto(DeliveryAssignment da) {
        return new DeliveryAssignmentResponseDto(
                da.getDeliveryAssignmentId(),
                da.getStatus(),
                da.getAssignedTime(),
                da.getOrderId(),
                da.getDeliveryPerson() != null ? da.getDeliveryPerson().getDeliveryPersonId() : 0,
                da.getDeliveryPerson() != null ? da.getDeliveryPerson().getDeliveryPersonName() : null
        );
    }
}

