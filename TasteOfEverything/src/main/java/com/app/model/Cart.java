package com.app.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
public class Cart 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cartId;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="customerId")
	private Customer customer;
	@OneToMany
	@JoinColumn(name="itemId")
	private List<Item> item;
	public Cart(Customer customer, List<Item> item) {
	
		this.customer = customer;
		this.item = item;
	}
	
	
}
