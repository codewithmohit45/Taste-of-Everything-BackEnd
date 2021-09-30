package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Cart;
import com.app.service.CartService;

@RestController
@CrossOrigin
public class CartController
{
	@Autowired
	private CartService service;

	@PostMapping("/cart")
	public Cart addCart(@RequestBody Cart cart) 
	{
		return service.addCart(cart);
	}

	@PutMapping("/cart")
	public Cart updateCart(@RequestBody Cart cart) 
	{
		return service.updateCart(cart);
	}

	@GetMapping("/carts")
	public List<Cart> getAllCart() 
	{
		return service.getAllCart();
	}
	
	@GetMapping("/cart/customerId/{customerId}")
	public List<Cart> getCartByCustomerId(@PathVariable int customerId) 
	{
		return service.getCartByCustomerId(customerId);
	}
	

	@DeleteMapping("/cart/{cartId}")
	public void deleteByCartId(@PathVariable int cartId) 
	{
		service.deleteByCartId(cartId);
	}
	
	@DeleteMapping("/cart/customerId/{customerId}")
	public void deleteCartByCustomerId(@PathVariable int customerId)
	{
		service.deleteCartByCustomerId(customerId);
	}
	
}