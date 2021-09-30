package com.app.service;

import java.util.List;

import com.app.model.Category;

public interface CategoryService {
	public Category addCategory(Category category);
	public Category updateCategory(Category category);
	public List<Category> getAllCategories();
	public void deleteCategory(int categoryId);
	public List<Category> getCategoryByCategoryName(String categoryName);
	public Category getCategoryByCategoryId(int categoryId);
}
