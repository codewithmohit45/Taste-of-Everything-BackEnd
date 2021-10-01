package com.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.app.model.Category;

import com.app.repository.CategoryRepository;
import com.app.service.CategoryService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryTest {
	
	@Autowired
	private CategoryService service;
	
	@MockBean
	private CategoryRepository repository;

	
	@Test
	 public void addCategoryTest() throws Exception {
		Category category=new Category(1, "Starter", null);
        when(repository.save(category)).thenReturn(category);
        assertEquals(category, service.addCategory(category));
	}  
	
	@Test
	public void updateCategory() throws Exception{
		Category category=new Category(1, "Starter", null);
        when(repository.save(category)).thenReturn(category);
        assertEquals(category, service.updateCategory(category));
	}
	
	@Test
	public void getAllCategoryTest() throws Exception {
		when(repository.findAll()).thenReturn(Stream.of(new Category(1,"Starter",null),new Category(2,"Biryani",null)).collect(Collectors.toList()));
	    assertEquals(2, service.getAllCategories().size());
	}
	
	
	
}
