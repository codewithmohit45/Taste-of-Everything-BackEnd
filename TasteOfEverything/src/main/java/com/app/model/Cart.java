package com.app.model;




import javax.persistence.Entity;
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
public class Cart 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartId;
	@ManyToOne
	@JoinColumn(name="customerId")
    private Customer customer;
	@ManyToOne
	@JoinColumn(name="itemId")
	private Item itemId;	
}
