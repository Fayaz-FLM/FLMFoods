package com.flmfoods.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(RestaurantIdNotFoundException.class)
	public ResponseEntity<String> handleRestaurantIdNotFoundException(RestaurantIdNotFoundException exceptionMessage){
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exceptionMessage.getMessage());
	}
	
}
