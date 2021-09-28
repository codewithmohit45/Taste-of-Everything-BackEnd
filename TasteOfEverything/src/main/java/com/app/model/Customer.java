package com.app.model;




import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;


import lombok.Data;


@Data
@Entity
@Table
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	private String customerEmail;
	private String customerPassword;
	private String customerName;
	private long customerContact;
	private String customerGender;	

}

//@OneToMany(targetEntity = Address.class)
////@JoinColumn(name="customerAddressFk",referencedColumnName = "customerId")
//private List<Address> address;
//@OneToMany(targetEntity = Order.class)
////@JoinColumn(name="customerOrderFk",referencedColumnName = "customerId")
//private List<Order> order;
//@OneToMany(targetEntity = Cart.class)
////@JoinColumn(name = "customerCartFk",referencedColumnName = "customerId")
//private List<Cart> cart;