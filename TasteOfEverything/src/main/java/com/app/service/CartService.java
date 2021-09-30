package com.app.service;

import java.util.List;

import com.app.model.Cart;

public interface CartService 
{
	public Cart addCart(Cart cart);
	public Cart updateCart(Cart cart);
	public List<Cart> getAllCart();
	public List<Cart> getCartByCustomerId(int customerId);
	public void deleteByCartId(int cartId);
	void deleteCartByCustomerId(int customerId);
}
