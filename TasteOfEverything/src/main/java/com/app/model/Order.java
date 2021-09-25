package com.app.model;

import java.util.List;

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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "Order")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;
	private String orderStatus;
	@ManyToOne
	@JoinColumn(name="customerId")
	private Customer customer;
	@OneToMany
	@JoinColumn(name="itemId")
	private List<Item> item;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="addressId")
	private Address address;
	public Order(String orderStatus, Customer customer, List<Item> item, Address address) {
		
		this.orderStatus = orderStatus;
		this.customer = customer;
		this.item = item;
		this.address = address;
	}
	
	
}
