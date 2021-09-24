package com.app.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int itemId;
	
	private String itemName;
	private double itemPrice;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="categoryId")
	private Category category;
}
