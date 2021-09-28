package com.app.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	
//	@OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
//	private List<Address> address;
//	
//	@OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
//	private List<Cart> cart;
//	
//	@OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
//	private List<Order> order;

}
