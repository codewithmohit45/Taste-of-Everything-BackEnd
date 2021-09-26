package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Cart;
import com.app.model.Item;
import com.app.model.Order;
import com.app.repository.OrderRepositoy;
import com.app.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepositoy repository;
    
	@Override
	public Order addOrder(Order order) {
		
		return repository.save(order);
	}

	@Override
	public Order updateOrder(Order order) {
		
		return repository.save(order);
	}

	@Override
	public List<Order> getAllOrders() {
		
		return repository.findAll();
	}

	@Override
	public List<Order> getOrderByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		return repository.findOrderByCustomer(customerId);
	}

	@Override
	public List<Order> getOrderByOrderStatus(String orderStatus) {
		
		return repository.findOrderByOrderStatus(orderStatus);
	}
	
	
}
