package com.app;

import static org.junit.Assert.assertEquals;

import static org.mockito.Mockito.when;

import java.util.stream.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.app.model.Cart;

import com.app.model.Customer;

import com.app.model.Item;
import com.app.repository.CartRepository;
import com.app.service.CartService;
@RunWith(SpringRunner.class)
@SpringBootTest
public class CartTest 
{
	@Autowired
	private CartService service;

	@MockBean
	private CartRepository repository;

	@Test
	public void addCartTest() throws Exception {
		Customer customer=new Customer();
		customer.setCustomerId(31);
		Item item= new Item();
		item.setItemId(21);
		Cart cart = new Cart(31, 41,customer, item);
		when(repository.save(cart)).thenReturn(cart);
		assertEquals(cart, service.addCart(cart));

		cart = new Cart(32, 42,customer, item);
		when(repository.save(cart)).thenReturn(cart);
		assertEquals(cart, service.addCart(cart));

		cart = new Cart(33, 43,customer, item);
		when(repository.save(cart)).thenReturn(cart);
		assertEquals(cart, service.addCart(cart));

		cart = new Cart(34, 44,customer, item);
		when(repository.save(cart)).thenReturn(cart);
		assertEquals(cart, service.addCart(cart));
	}
	
	@Test
	public void updateCartTest() throws Exception {
		Customer customer=new Customer();
		customer.setCustomerId(31);
		Item item= new Item();
		item.setItemId(21);
		Cart cart = new Cart(31, 41,customer, item);
		when(repository.save(cart)).thenReturn(cart);
		assertEquals(cart, service.updateCart(cart));
	}
	@Test
	public void getCartTest() {
		Customer customer=new Customer();
		customer.setCustomerId(31);
		Item item= new Item();
		item.setItemId(21);
		when(repository.findAll()).thenReturn(Stream.of(new Cart(34, 44,customer, item ),
		new Cart(34, 44,customer, item)).collect(Collectors.toList()));
		assertEquals(2, service.getAllCart().size());

	}
	void contextLoads() 
	{
	}

}
