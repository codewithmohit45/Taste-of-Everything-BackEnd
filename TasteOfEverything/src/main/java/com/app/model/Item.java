package com.app.model;





import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table


public class Item
{   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int itemId;
	private String itemName;
	private double itemPrice;
	@Lob
	@Column(columnDefinition = "CLOB")
	private String itemImage;
	
	@ManyToOne
	@JoinColumn(name = "categoryId")
	private Category category;
	
}