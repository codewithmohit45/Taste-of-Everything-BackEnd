package com.app.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
	
//	@OneToMany(targetEntity = Address.class,cascade = CascadeType.ALL)
//	@JoinColumn(name="customerAddressFk",referencedColumnName = "customerId")
//	private List<Address> address;
//	@OneToMany(targetEntity = Order.class,cascade = CascadeType.ALL)
//	@JoinColumn(name="customerOrderFk",referencedColumnName = "customerId")
//	private List<Order> order;
//	@OneToOne(targetEntity = Cart.class,cascade = CascadeType.ALL)
//	@JoinColumn(name = "customerCartFk",referencedColumnName = "customerId")
//    private Cart cart;

	
	
	
}
