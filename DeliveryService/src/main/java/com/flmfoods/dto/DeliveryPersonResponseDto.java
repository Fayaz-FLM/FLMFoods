package com.flmfoods.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryPersonResponseDto {
    private long deliveryPersonId;
    private String deliveryPersonName;
    private String phoneNum;
    private String email;
    private boolean isAvailable;
    private double rating;
    private List<DeliveryAssignmentResponseDto> deliveryAssignments;
}

