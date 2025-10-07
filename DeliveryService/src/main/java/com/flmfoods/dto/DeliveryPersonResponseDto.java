package com.flmfoods.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryPersonResponseDto {

	private long deliveryPersonId;

	private String deliveryPersonName;

	private List<DeliveryAssignmentResponseDto> DeliveryAssignmentResponseDtoList;

}
