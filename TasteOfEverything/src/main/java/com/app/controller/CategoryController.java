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
import com.app.service.CategoryService;

@RestController
@CrossOrigin
public class CategoryController {

	@Autowired
	private CategoryService service;
	
	@PostMapping("/category")
	public Category addCategory(@RequestBody Category category)
	{
		return service.addCategory(category);
	}
	
	@PutMapping("/category")
	public Category updateCategory(@RequestBody Category category)
	{
		return service.updateCategory(category);
	}
	
	@GetMapping("/categorys")
	public List<Category> getAllCategorys()
	{
		return service.getAllCategorys();
	}
	
//	@GetMapping("/category/cat_name/{cat_name}")
//	public List<Category> getCategoryByName(@PathVariable String cat_name)
//	{
//		return service.getCategoryByName(cat_name);
//	}
	
	@DeleteMapping("/category/{cat_id}")
	public void deleteCategory(@PathVariable int cat_id)
	{
		service.deleteCategory(cat_id);
	}
}