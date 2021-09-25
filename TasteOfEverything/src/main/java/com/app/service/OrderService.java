package com.app.service;

import java.util.List;

import com.app.model.Cart;
import com.app.model.Item;
import com.app.model.Order;

public interface OrderService {
	public Order addOrder(Order order);
	public Order updateOrder(Order order);
	public List<Order> getAllOrders();
	public List<Order> getOrderByCustomerId(int customerId);
	public List<Order> getOrderByOrderStatus(String orderStatus);
}


//5. Functionality(Order)
//Controller Name : orderController
//Service Name : orderService
//Service Implimentation: orderServiceImpl
//Repository Name: orderRepository
//Order
//PostMapping("/order")
//Item addOrder(@RequestBody Order order)
//PutMapping("/order")
//Item updateOrder(@RequestBody Order order)
//GetMapping("/orders")
//List<Item> getAllOrders()
//GetMapping("/order/{cust_id}")
//List<Item> getOrderByCustomerId(@PathVariable int cust_id )
//GetMapping("/order/{order_status}")
//List<Item> getOrderByStatus(@PathVariable String order_status)


