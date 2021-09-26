package com.app.model;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
public class Address {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addressId;
	private String address;
	@ManyToOne(targetEntity = Customer.class,cascade = CascadeType.ALL,fetch =  FetchType.LAZY)
	@JoinColumn(name="customerId",referencedColumnName = "customerId")
	private Customer customer;
//	@OneToOne//(mappedBy = "address",cascade = CascadeType.ALL,fetch =  FetchType.LAZY)
//	private Order order;
	
	
     
	
	
}
