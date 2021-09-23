package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Category;
import com.app.repository.CategoryRepository;
import com.app.service.CategoryService;


@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository repository;
	@Override
	public Category addCategory(Category category) {
		
		return repository.save(category);
	}

	@Override
	public Category updateCategory(Category category) {
		
		return repository.save(category);
	}

	@Override
	public List<Category> getAllCategorys() {
		
		return repository.findAll();
	}

	@Override
	public void deleteCategory(int cat_id) {
	
		repository.deleteById(cat_id);
		System.out.println("Deleted SuccessFully");
	}

//	@Override
//	public List<Category> getCategoryByName(String cat_name) {
//		
//		return  repository.findByName(cat_name);
//	}
	
    
}