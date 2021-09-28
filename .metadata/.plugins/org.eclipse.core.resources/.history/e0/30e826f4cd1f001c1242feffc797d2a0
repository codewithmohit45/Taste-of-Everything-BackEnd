package com.app.model;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartId;
	@ManyToOne
	@JoinColumn(name="customerId")
    private Customer customer;
	@ManyToOne
	@JoinColumn(name="itemId")
	private Item itemId;
	
	
	
}
//@OneToOne(targetEntity = Customer.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//@JoinColumn(name="customerId",referencedColumnName = "customerId")
//private Customer customer;
//@ManyToOne(targetEntity = Item.class,cascade = CascadeType.ALL)
//@JoinColumn(name="itemId",referencedColumnName = "itemId")
////private int itemId;