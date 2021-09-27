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
	
	@GetMapping("customer/order/{customerId}")
	public List<Order> getOrderByCustomerId(@PathVariable int customerId)
	{
		return service.getOrderByCustomerId(customerId);
	}
	
	@GetMapping("customer/order/orderStatus/{orderStatus}")
	public List<Order> getOrderByOrderStatus(@PathVariable String orderStatus)
	{
		return service.getOrderByOrderStatus(orderStatus);		
	}
}

//5. Functionality(Order)
//Controller Name : orderController
//Service Name : orderService
//Service Implimentation: orderServiceImpl
//Repository Name: orderRepository
//Order
//PostMapping("customer/order")
//Order addOrder(@RequestBody Order order)
//PutMapping("customer/order")
//Order updateOrder(@RequestBody Order order)
//GetMapping("customer/orders")
//List<Order> getAllOrders()
//GetMapping("customer/order/{customerId}")
//List<Order> getOrderByCustomerId(@PathVariable int customerId )
//GetMapping("customer/order/orderStatus/{orderStatus}")
//List<Order> getOrderByStatus(@PathVariable String orderStatus)
