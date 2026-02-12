package com.flmfoods.exception;

public class OrderIdNotFoundException extends RuntimeException{

	public OrderIdNotFoundException(String exceptionMessage) {
		super(exceptionMessage);
	}
}
