package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer>
{

	//void deleteByItemId(int itemId);

//	void deleteCart(int customerId);
//
//	void deleteByItemId(int itemId);
	
}