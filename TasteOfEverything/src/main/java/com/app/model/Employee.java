package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Employee {

	@Id
	@GeneratedValue
	private int emp_id;
	private String emp_name;
	private String emp_email;
	private String emp_password;
}
