package com.app.service;

import java.util.List;

import com.app.model.Cart;

public interface CartService 
{
	public Cart addCart(Cart cart);
	public Cart updateCart(Cart cart);
	public List<Cart> getAllCart();
	public void deleteCart(int customerId);
	public void deleteByItemId(int itemId);
}
