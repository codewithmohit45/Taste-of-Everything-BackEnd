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
@Table(name="Address")
public class Address {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addressId;
	private String address;
	@ManyToOne(fetch =  FetchType.LAZY)
	@JoinColumn(name="customerId")
	private Customer customer;
	@OneToOne(mappedBy = "address",cascade = CascadeType.ALL,fetch =  FetchType.LAZY)
	private Order order;
	public Address(String address, Customer customer, Order order) {
		this.address = address;
		this.customer = customer;
		this.order = order;
	}
     
	
	
}
