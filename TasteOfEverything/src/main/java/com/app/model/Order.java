package com.app.model;



import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    @JoinColumn(name ="customerId_fk")
    private Customer customer;
	
	@ManyToOne
    @JoinColumn(name ="itemId_fk")
    private Item item;
	
	@ManyToOne
    @JoinColumn(name ="addressId_fk")
    private Address address;
	
	
}
