package com.app.service;

import java.util.List;

import com.app.model.Category;

public interface CategoryService {
	public Category addCategory(Category category);
	public Category updateCategory(Category category);
	public List<Category> getAllCategorys();
	public void deleteCategory(int cat_id);
	//public List<Category> getCategoryByName(String cat_name);

}