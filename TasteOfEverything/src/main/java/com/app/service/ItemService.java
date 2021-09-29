package com.app.service;

import java.util.List;

import com.app.model.Item;



public interface ItemService 
{
	public Item addItem(Item item);
	public Item updateItem(Item item);
	public List<Item> getAllItems();
	public List<Item> getItemByCategory(int categoryId);
	public void deleteItemById(int itemId);
}
