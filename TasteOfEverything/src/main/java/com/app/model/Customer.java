package com.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.metamodel.StaticMetamodel;

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
@Table(name="Customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	private String customerEmail;
	private String customerPassword;
	private String customerName;
	private long customerContact;
	private String customerGender;
	@OneToMany//(mappedBy = "Customer",cascade = CascadeType.ALL)
	private List<Address> address;
	@OneToMany//(mappedBy = "Customer",cascade = CascadeType.ALL)
	private List<Order> order;
	@OneToOne//(mappedBy = "Customer",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Cart cart;
	public Customer(String customerEmail, String customerPassword, String customerName, long customerContact,
			String customerGender, List<Address> address, List<Order> order, Cart cart) {
		this.customerEmail = customerEmail;
		this.customerPassword = customerPassword;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerGender = customerGender;
		this.address = address;
		this.order = order;
		this.cart = cart;
	}
	
	
}
