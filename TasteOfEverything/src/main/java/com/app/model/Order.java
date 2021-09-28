package com.app.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
