package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Category;
import com.app.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer>
{

	List<Item> findItemByCategory(Category category);
}
