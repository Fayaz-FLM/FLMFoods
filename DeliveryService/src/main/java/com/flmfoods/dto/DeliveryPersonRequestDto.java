package com.flmfoods.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryPersonRequestDto {

	private String deliveryPersonName;

	private String aadharNum;

	private String phoneNum;

	private String email;

	private boolean isAvailable;

	private double rating;

	private List<DeliveryAssignmentRequestDto> deliveryAssignmentsRequestDtoList;
}
