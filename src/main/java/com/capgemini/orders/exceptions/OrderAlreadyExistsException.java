package com.capgemini.orders.exceptions;

public class OrderAlreadyExistsException extends RuntimeException {
	public OrderAlreadyExistsException() {
	}

	public OrderAlreadyExistsException(String message) {
		super(message);
	}

}
