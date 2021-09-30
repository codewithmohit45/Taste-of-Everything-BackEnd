package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Cart;
import com.app.model.Customer;
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
	public List<Cart> getCartByCustomerId(int customerId) 
	{
		Customer customer =new Customer();
		customer.setCustomerId(customerId);
		return repository.findCartByCustomer(customer);
	}
	
	@Override
	public void deleteCartByCustomerId(int customerId) 
	{
		Customer customer =new Customer();
		customer.setCustomerId(customerId);
		List<Cart> listCart=repository.findCartByCustomer(customer);
		for(Cart i:listCart)
		{
			int cartId=i.getCartId();
			repository.deleteById(cartId);
		}
	}

	@Override
	public void deleteByCartId(int cartId) 
	{
		repository.deleteById(cartId);
	}

}

