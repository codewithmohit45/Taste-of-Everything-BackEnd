package com.app.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	
	@ManyToOne
    @JoinColumn(name ="customerId_fk")
    private Customer customer;
//	
//	@OneToMany(mappedBy = "address",cascade = CascadeType.ALL)
//	private List<Order> order;
}
