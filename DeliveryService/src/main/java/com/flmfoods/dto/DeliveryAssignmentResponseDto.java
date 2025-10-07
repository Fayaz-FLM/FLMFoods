package com.flmfoods.dto;

import java.time.LocalTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryAssignmentResponseDto {
    private long deliveryAssignmentId;
    private String status;
    private LocalTime assignedTime;
    private long orderId;
    private long deliveryPersonId;
    private String deliveryPersonName;
}

