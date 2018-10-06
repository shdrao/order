package com.capgemini.orders.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ordertable")
public class Order {
	@Id
	private int orderId;
	private String orderName;
	private LocalDate orderDate;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(String orderName, int orderId, LocalDate orderDate) {
		super();
		this.orderName = orderName;
		this.orderId = orderId;
		this.orderDate = orderDate;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Order [orderName=" + orderName + ", orderId=" + orderId + ", orderDate=" + orderDate + "]";
	}

}
