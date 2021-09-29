package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Cart;
import com.app.model.Customer;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer>
{


	List<Cart> findCartByCustomer(Customer customer);	
}