package com.capgemini.orders.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.orders.entity.Order;
import com.capgemini.orders.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping("/add")
	public ResponseEntity<Order> addOrder(@RequestBody Order order) {
		ResponseEntity<Order> responseEntity = new ResponseEntity<>(orderService.addOrder(order), HttpStatus.OK);
		return responseEntity;
	}

	@DeleteMapping("/delete/{orderId}")
	public ResponseEntity<Order> deleteOrder(@RequestParam int orderId) {
		Order order1 = orderService.findOrderById(orderId);
		if (order1 != null) {
			orderService.deleteOrder(orderId);
			return new ResponseEntity<Order>(HttpStatus.OK);
		}
		return new ResponseEntity<Order>(HttpStatus.NOT_FOUND);
	}

}
