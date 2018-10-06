package com.capgemini.orders.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.orders.entity.Order;
import com.capgemini.orders.exceptions.OrderAlreadyExistsException;
import com.capgemini.orders.exceptions.OrderDoesNotExist;
@Service
public interface OrderService {
	
	public Order addOrder(Order order) throws OrderAlreadyExistsException;
	public void deleteOrder(int orderId) throws OrderDoesNotExist;
	public List viewAllOrders();
	public Order findOrderById(int orderId)throws OrderDoesNotExist;

}
