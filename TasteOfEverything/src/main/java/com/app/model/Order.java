package com.app.model;

import java.util.List;

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
	@ManyToOne(targetEntity = Customer.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="customerId",referencedColumnName = "customerId")
	private Customer customer;
	@OneToOne(targetEntity = Item.class,cascade = CascadeType.ALL)
	@JoinColumn(name="itemId",referencedColumnName = "itemId")
	private Item item;
	@OneToOne(targetEntity = Address.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="addressId",referencedColumnName = "addressId")
	private Address address;
	
	
	
}
