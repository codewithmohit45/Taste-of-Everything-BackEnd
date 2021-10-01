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
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor

public class Cart 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartId;
	private int quantity;
	@ManyToOne
	@JoinColumn(name="customerId")
    private Customer customer;
	@ManyToOne
	@JoinColumn(name="itemId")
	private Item item;	
}
