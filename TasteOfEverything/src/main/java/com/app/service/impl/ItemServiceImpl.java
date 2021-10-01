package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Cart;
import com.app.model.Category;

import com.app.model.Item;
import com.app.model.Order;
import com.app.repository.CartRepository;
import com.app.repository.ItemRepository;
import com.app.repository.OrderRepository;
import com.app.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService
{
	@Autowired
	private ItemRepository repository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CartRepository cartRepository;
	
	@Override
	public Item addItem(Item item) 
	{
		return repository.save(item);
	}

	@Override
	public Item updateItem(Item item) 
	{
		return repository.save(item);
	}

	@Override
	public List<Item> getAllItems() 
	{
		return repository.findAll();
	}


	@Override
	public List<Item> getItemByCategory(int categoryId) 
	{
		Category c=new Category();
		c.setCategoryId(categoryId);
		System.out.println("service :"+categoryId);
		List<Item> itemList=repository.findItemByCategory(c);
		System.out.println("itemList :"+itemList);
		return itemList;
	}

	@Override
	public void deleteItemById(int itemId) 
	{
		Item item=new Item();
		item.setItemId(itemId);
		List<Order> orderList=orderRepository.findOrderByItem(item);
		for(Order o:orderList)
		{
			int orderId=o.getOrderId();
			orderRepository.deleteById(orderId);
		}
		Item item1=new Item();
		item1.setItemId(itemId);
		List<Cart> listCart=cartRepository.findCartByItem(item);
		for(Cart i:listCart)
		{
			int cartId=i.getCartId();
			cartRepository.deleteById(cartId);
		}
		
		repository.deleteById(itemId);
	}

}

