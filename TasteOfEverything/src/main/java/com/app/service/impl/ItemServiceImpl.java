package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Category;
import com.app.model.Item;
import com.app.repository.ItemRepository;
import com.app.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService
{
	@Autowired
	private ItemRepository repository;
	
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
		repository.deleteById(itemId);
	}

}

