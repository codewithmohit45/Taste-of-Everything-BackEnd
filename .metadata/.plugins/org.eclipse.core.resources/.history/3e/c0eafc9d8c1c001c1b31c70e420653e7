package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table


public class Item
{
	@Id
	@GeneratedValue
	private int item_id;
	
	private String item_name;
	private double item_price;
	
	//@OneToMany
	private Category cat_id;
}
