package com.app.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Address {
 
	@Id
	@GeneratedValue
	private int address_id;
	private String address;
	private Customer cust_id;
     
}
