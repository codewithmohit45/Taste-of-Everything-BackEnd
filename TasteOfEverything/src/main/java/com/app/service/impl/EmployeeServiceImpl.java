package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.model.Employee;
import com.app.repository.CustomerRepository;
import com.app.repository.EmployeeRepository;
import com.app.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	private EmployeeRepository repository;
	
	@Override
	public Employee addEmployee(Employee employee) 
	{
		return repository.save(employee);
	}

	@Override
	public boolean checkEmployee(String emp_email, String emp_password) 
	{
//		if(repository.findByEmployee(emp_email,emp_password))
//		return true;
//		else
		return false;
	}

	@Override
	public Employee updateEmployee(Employee employee) 
	{
		
		return repository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() 
	{
		return  repository.findAll();
	}

	@Override
	public Employee getEmployeeById(int emp_id) 
	{
		return repository.findById(emp_id).get();
	}

	@Override
	public void deleteEmployeeById(int emp_id) 
	{
		repository.deleteById(emp_id);
	}

}
