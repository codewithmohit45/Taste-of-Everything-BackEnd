package com.app.service;

import java.util.List;

import com.app.model.Order;

public interface OrderService {
	public Order addOrder(Order order);
	public Order updateOrder(Order order);
	public List<Order> getAllOrders();
	public List<Order> getOrderByCustomerId(int customerId);
	public List<Order> getOrderByOrderStatus(String orderStatus);
}
