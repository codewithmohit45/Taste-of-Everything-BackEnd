package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Cart;
import com.app.model.Customer;
import com.app.model.Item;
import com.app.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
	public List<Order> findOrderByCustomer(Customer customer);
	public List<Order> findOrderByOrderStatus(String orderStatus);
	public List<Order> findOrderByItem(Item item);
}
