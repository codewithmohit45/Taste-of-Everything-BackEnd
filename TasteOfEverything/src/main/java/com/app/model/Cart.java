package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table

public class Cart 
{
	@Id
	@GeneratedValue
	private int cart_id;
	//@OneToOne
	private Customer cust_id;
	//@OneToMany
	private Item item_id;
}
