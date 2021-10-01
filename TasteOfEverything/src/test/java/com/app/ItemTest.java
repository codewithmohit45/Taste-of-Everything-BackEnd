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

import com.app.model.Category;

import com.app.model.Item;
import com.app.repository.ItemRepository;
import com.app.service.ItemService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ItemTest 
{
	@Autowired
	private ItemService service;

	@MockBean
	private ItemRepository repository;
	
	@Test
	public void addItemTest() throws Exception {
		Category category=new Category();
		category.setCategoryId(8);
		Item item = new Item(1, "rgsi1", 99.00D , "rgs.com", category);
		when(repository.save(item)).thenReturn(item);
		assertEquals(item, service.addItem(item));

		item = new Item(2, "rgsi1", 99.00D , "rgs.vom", category);
		when(repository.save(item)).thenReturn(item);
		assertEquals(item, service.addItem(item));

		item = new Item(3, "rgsi1", 99.00D , "rgs.vom", category);
		when(repository.save(item)).thenReturn(item);
		assertEquals(item, service.addItem(item));

		item = new Item(4, "rgsi1", 99.00D , "rgs.vom", category);
		when(repository.save(item)).thenReturn(item);
		assertEquals(item, service.addItem(item));
	}
	
	@Test
	public void updateItemTest() throws Exception {
		Category category=new Category();
		category.setCategoryId(1);
		Item item = new Item(5, "rgsi1", 99.00D , "rgs.com", category);
		when(repository.save(item)).thenReturn(item);
		assertEquals(item, service.updateItem(item));
		
		category.setCategoryId(2);
		item = new Item(6, "rgsi1", 99.00D , "rgs.vom", category);
		when(repository.save(item)).thenReturn(item);
		assertEquals(item, service.updateItem(item));

		category.setCategoryId(3);
		item = new Item(7, "rgsi1", 99.00D , "rgs.vom", category);
		when(repository.save(item)).thenReturn(item);
		assertEquals(item, service.updateItem(item));

		category.setCategoryId(4);
		item = new Item(8, "rgsi1", 99.00D , "rgs.vom", category);
		when(repository.save(item)).thenReturn(item);
		assertEquals(item, service.updateItem(item));
	}

	@Test
	public void getItemTest() {
		Category category=new Category();
		category.setCategoryId(6);
		when(repository.findAll()).thenReturn(Stream.of(new Item(9, "rgsi1", 99.00D , "rgs.vom", category ),
		new Item(10, "rgsi1", 99.00D , "rgs.vom", category)).collect(Collectors.toList()));
		assertEquals(2, service.getAllItems().size());
	}
	@Test
	void contextLoads() {
	}

}
