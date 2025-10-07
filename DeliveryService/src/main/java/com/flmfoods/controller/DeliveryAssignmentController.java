package com.flmfoods.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flmfoods.dto.DeliveryAssignmentRequestDto;
import com.flmfoods.dto.DeliveryAssignmentResponseDto;
import com.flmfoods.service.impl.DeliveryServiceImpl;

@RestController
@RequestMapping("/delivery-assignment")
public class DeliveryAssignmentController {
	
	@Autowired
	DeliveryServiceImpl deliveryService;
	
	@PostMapping("/assignOrder")
	public ResponseEntity<DeliveryAssignmentResponseDto> assignOrder(@RequestBody DeliveryAssignmentRequestDto deliveryAssignmentRequest){
		DeliveryAssignmentResponseDto assignedOrder = deliveryService.assignOrderToDeliveryPerson(deliveryAssignmentRequest);
		return ResponseEntity.status(HttpStatus.CREATED).body(assignedOrder);
	}
	
}
