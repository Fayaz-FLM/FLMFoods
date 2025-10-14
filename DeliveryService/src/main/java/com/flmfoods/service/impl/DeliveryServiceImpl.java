package com.flmfoods.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.flmfoods.dto.DeliveryAssignmentRequestDto;
import com.flmfoods.dto.DeliveryPersonRequestDto;
import com.flmfoods.dto.DeliveryAssignmentResponseDto;
import com.flmfoods.dto.DeliveryPersonResponseDto;
import com.flmfoods.dto.OrderResponseDto;
import com.flmfoods.dto.RestaurantCreationResponse;
import com.flmfoods.dto.RestaurantRequestDto;
import com.flmfoods.dto.DeliveryAssignmentMapper;
import com.flmfoods.dto.DeliveryPersonMapper;
import com.flmfoods.model.DeliveryAssignment;
import com.flmfoods.model.DeliveryPerson;
import com.flmfoods.client.RestaurantClient;
import com.flmfoods.dao.DeliveryAssignmentRepository;
import com.flmfoods.dao.DeliveryPersonRepository;
import com.flmfoods.service.DeliveryService;

@Service
public class DeliveryServiceImpl implements DeliveryService {

    @Autowired
    private DeliveryPersonRepository deliveryPersonRepository;

    @Autowired
    private DeliveryAssignmentRepository deliveryAssignmentRepository;
    
    @Autowired
    private RestTemplate restTemplate;
    
    @Autowired
    private RestaurantClient restaurantClient;

    @Override
    public DeliveryPersonResponseDto registerDeliveryPerson(DeliveryPersonRequestDto request) {
        DeliveryPerson dp = DeliveryPersonMapper.toEntity(request);
        DeliveryPerson saved = deliveryPersonRepository.save(dp);
        return DeliveryPersonMapper.toResponseDto(saved);
    }

    @Override
    public DeliveryAssignmentResponseDto assignOrderToDeliveryPerson(DeliveryAssignmentRequestDto request) {
        DeliveryPerson dp = deliveryPersonRepository.findById(request.getDeliveryPersonId())
                .orElseThrow(() -> new RuntimeException("Delivery person not found"));

        DeliveryAssignment assignment = DeliveryAssignmentMapper.toEntity(request, dp);
        DeliveryAssignment saved = deliveryAssignmentRepository.save(assignment);

        dp.getDeliveryAssignments().add(saved);
        deliveryPersonRepository.save(dp);

        return DeliveryAssignmentMapper.toResponseDto(saved);
    }

	@Override
	public ResponseEntity<OrderResponseDto> updateOrderStatus(long orderId, String status) {
		ResponseEntity<OrderResponseDto> orderResponseEntity = restTemplate.exchange(
				"http://localhost:8004/orders/status/"+orderId+"?status="+status,
				HttpMethod.PUT,
				null,
				OrderResponseDto.class
				);
		return orderResponseEntity;
	}
	
	@Override
	public ResponseEntity<String> getRestaurantName(long restaurantId) {
		return restaurantClient.getRestaurantNameById(restaurantId);
	}

	public ResponseEntity<RestaurantCreationResponse> addRestaurant(RestaurantRequestDto restaurantRequestDto) {
		return restaurantClient.addRestaurant(restaurantRequestDto);
	}
	
	
}
