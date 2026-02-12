package com.flmfoods.exception;

public class RestaurantIdNotFoundException extends RuntimeException{
	
	public RestaurantIdNotFoundException(String exceptionMessage) {
		super(exceptionMessage);
	}

}
