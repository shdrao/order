package com.capgemini.orders.exceptions;

public class OrderDoesNotExist extends RuntimeException {
	public OrderDoesNotExist() {
	}

	public OrderDoesNotExist(String message) {
		super(message);
	}
}
