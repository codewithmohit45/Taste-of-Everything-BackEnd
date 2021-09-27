package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Cart;
import com.app.model.Order;

@Repository
public interface OrderRepositoy extends JpaRepository<Order, Integer> {
	public List<Order> findOrderByCustomer(int customerId);
	public List<Order> findOrderByOrderStatus(String orderStatus);
}
