package com.app.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	private String orderStatus;
	private int quantity;
	@ManyToOne
	@JoinColumn(name = "customerId")
	private Customer customer;
	@ManyToOne
	@JoinColumn(name="itemId")
	private Item item;
	@ManyToOne
	@JoinColumn(name = "addressId")
	private Address address;
	
	
	
}
