package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Employee;
import com.app.repository.CustomerRepository;
import com.app.repository.EmployeeRepository;
import com.app.service.EmployeeService;

@Service
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
	public boolean checkEmployee(String employeeEmail, String employeePassword) 
	{
//		if(repository.findByEmployee( employeeEmail,employeePassword))
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
		return repository.findAll();
	}

	@Override
	public Employee getEmployeeById(int employeeId) 
	{
		return repository.findById(employeeId).get();
	}

	@Override
	public void deleteEmployeeById(int employeeId) 
	{
		repository.deleteById(employeeId);
	}

}
