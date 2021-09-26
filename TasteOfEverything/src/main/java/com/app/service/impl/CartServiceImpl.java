package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Cart;
import com.app.repository.CartRepository;
import com.app.service.CartService;

@Service
public class CartServiceImpl implements CartService
{
	@Autowired
	private CartRepository repository;
	
	@Override
	public Cart addCart(Cart cart) 
	{
		return repository.save(cart);
	}

	@Override
	public Cart updateCart(Cart cart) 
	{
		return repository.save(cart);
	}

	@Override
	public List<Cart> getAllCart() 
	{
		return repository.findAll();
	}

	@Override
	public void deleteCart(int customerId) 
	{
		repository.deleteById(customerId);
	}

	@Override
	public void deleteByItemId(int itemId) 
	{
		//repository.deleteByItemId(itemId);
	}

}

