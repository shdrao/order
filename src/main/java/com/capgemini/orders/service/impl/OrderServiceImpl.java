package com.capgemini.orders.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.orders.entity.Order;
import com.capgemini.orders.exceptions.OrderAlreadyExistsException;
import com.capgemini.orders.exceptions.OrderDoesNotExist;
import com.capgemini.orders.repository.OrderRepository;
import com.capgemini.orders.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Order addOrder(Order order) throws OrderAlreadyExistsException {
		Optional<Order> order1 = orderRepository.findById(order.getOrderId());
		if (order1.isPresent()) {
			throw new OrderAlreadyExistsException("Order already exists");
		}
		return orderRepository.save(order);
	}

	@Override
	public void deleteOrder(int orderId) throws OrderDoesNotExist {
		Optional<Order> order1 = orderRepository.findById(orderId);
		if (!order1.isPresent()) {
			throw new OrderDoesNotExist("Order does not exist");
		}
		orderRepository.deleteById(order1.get().getOrderId());
	}

	@Override
	public List<Order> viewAllOrders() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

	@Override
	public Order findOrderById(int orderId) throws OrderDoesNotExist {
		// TODO Auto-generated method stub
		Optional<Order> order1 = orderRepository.findById(orderId);
		if (!order1.isPresent()) {
			throw new OrderDoesNotExist("No order present");
		}
		return order1.get();

	}

}
