package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Order;
import com.app.service.OrderService;

@RestController
@CrossOrigin
public class OrderController {
	
	@Autowired
	private OrderService service;
	
	@PostMapping("/customer/order")
	public Order addOrder(@RequestBody Order order)
	{
		return service.addOrder(order);
	}
	
	@PutMapping("/customer/order")
	public Order updateOrder(@RequestBody Order order)
	{
		return service.updateOrder(order);
	}

	@GetMapping("/customer/orders")
	public List<Order> getAllOrders()
	{
		return service.getAllOrders();
	}
	
	@GetMapping("/customer/order/{customerId}")
	public List<Order> getOrderByCustomerId(@PathVariable int customerId)
	{
		return service.getOrderByCustomerId(customerId);
	}
	
	@GetMapping("/employee/orderStatus/{orderStatus}")
	public List<Order> getOrderByOrderStatus(@PathVariable String orderStatus)
	{
		return service.getOrderByOrderStatus(orderStatus);		
	}
}