package com.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table


public class Item
{   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int itemId;
	
	private String itemName;
	private double itemPrice;
	private String itemImage;
	
	@ManyToOne
	@JoinColumn(name="categoryId_fk",referencedColumnName = "categoryId")
	private Category category;
	
	@OneToMany(mappedBy = "item",cascade = CascadeType.ALL)
	private List<Cart> cart;
	
	@OneToMany(mappedBy = "item",cascade = CascadeType.ALL)
	private List<Order> order;
		
	
}
