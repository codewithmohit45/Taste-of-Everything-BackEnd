package com.app.model;





import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
//	@ManyToOne//(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//	private Order order;
	
	@ManyToOne(targetEntity = Category.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="categoryId",referencedColumnName = "categoryId")
	private Category category;


	
	
}
