package com.app.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
public class Category {
    
	@Id
	@GeneratedValue
	private int cat_id;
	private String cat_name;
}
