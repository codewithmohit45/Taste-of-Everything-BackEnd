package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Customer {

	@Id
	@GeneratedValue
	private int cust_id;
	private String cust_email;
	private String cust_password;
	private String cust_name;
	private long cust_contact;
	private String cust_gender;
    
	
}
