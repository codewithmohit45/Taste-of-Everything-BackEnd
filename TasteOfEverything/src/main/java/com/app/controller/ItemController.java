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

import com.app.model.Category;
import com.app.model.Item;
import com.app.service.CategoryService;
import com.app.service.ItemService;
import com.app.service.impl.CategoryServiceImpl;

@RestController
@CrossOrigin
public class ItemController
{
	@Autowired
	private ItemService service;

	@PostMapping("/item")
	public Item addItem(@RequestBody Item item) 
	{
		return service.addItem(item);
	}

	@PutMapping("/item")
	public Item updateItem(@RequestBody Item item) 
	{
		return service.updateItem(item);
	}

	@GetMapping("/items")
	public List<Item> getAllItems() 
	{
		return service.getAllItems();
	}

	@GetMapping("/item/itemName/{itemName}")
	public List<Item> getItemByName(@PathVariable String itemName) 
	{
		return service.getItemByName(itemName);
	}

	@GetMapping("/item/{categoryId}")
	public List<Item> getItemByCategoryId(@PathVariable int categoryId) 
	{	
		
		CategoryService categoryService = new CategoryServiceImpl();
		Category category = categoryService.getCategoryById(categoryId);
		System.out.println("++++++++"+category);
		return service.getItemByCategory(category);
	}

	@DeleteMapping("/item/{itemId}")
	public void deleteItemById(int itemId) 
	{
		service.deleteItemById(itemId);
	}
	
	
}
