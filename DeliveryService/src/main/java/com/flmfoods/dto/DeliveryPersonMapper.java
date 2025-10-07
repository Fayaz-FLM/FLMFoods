package com.flmfoods.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.flmfoods.dto.DeliveryPersonRequestDto;
import com.flmfoods.dto.DeliveryPersonResponseDto;
import com.flmfoods.model.DeliveryAssignment;
import com.flmfoods.model.DeliveryPerson;

public class DeliveryPersonMapper {

    public static DeliveryPerson toEntity(DeliveryPersonRequestDto dto) {
        DeliveryPerson dp = new DeliveryPerson();
        dp.setDeliveryPersonName(dto.getDeliveryPersonName());
        dp.setAadharNum(dto.getAadharNum());
        dp.setPhoneNum(dto.getPhoneNum());
        dp.setEmail(dto.getEmail());
        dp.setAvailable(dto.isAvailable());
        dp.setRating(dto.getRating());
        return dp;
    }

    public static DeliveryPersonResponseDto toResponseDto(DeliveryPerson dp) {
        List<DeliveryAssignmentResponseDto> assignments = null;
        if (dp.getDeliveryAssignments() != null) {
            assignments = dp.getDeliveryAssignments()
                    .stream()
                    .map(DeliveryAssignmentMapper::toResponseDto)
                    .collect(Collectors.toList());
        }

        return new DeliveryPersonResponseDto(
                dp.getDeliveryPersonId(),
                dp.getDeliveryPersonName(),
                dp.getPhoneNum(),
                dp.getEmail(),
                dp.isAvailable(),
                dp.getRating(),
                assignments
        );
    }
}

