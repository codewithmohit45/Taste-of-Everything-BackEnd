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
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;
	private String orderStatus;
	@ManyToOne
	@JoinColumn(name = "customerId")
	private Customer customer;
	@OneToOne
	@JoinColumn(name="itemId")
	private Item item;
	@OneToOne
	@JoinColumn(name = "addressId")
	private Address address;
	
	
	
}
//@ManyToOne(targetEntity = Customer.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//@JoinColumn(name="customerId",referencedColumnName = "customerId")
//private int customerId;
//@ManyToOne(targetEntity = Item.class,cascade = CascadeType.ALL)
//@JoinColumn(name="itemId",referencedColumnName = "itemId")
//private int itemId;
//@OneToOne(targetEntity = Address.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//@JoinColumn(name="addressId",referencedColumnName = "addressId")
//private int addressId;