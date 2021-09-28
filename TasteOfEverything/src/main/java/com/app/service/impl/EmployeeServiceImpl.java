package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.app.model.Employee;
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
	public Employee updateEmployee(Employee employee) 
	{
		
		return repository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() 
	{
		return  repository.findAll();
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

	
	@Override
	public Employee getEmployeeByEmployeeEmailAndEmployeePassword(String employeeEmail, String employeePassword)throws Exception {
		Employee employee =null;
		if(employeeEmail!=null && employeePassword!=null )
			employee=repository.findEmployeeByEmployeeEmailAndEmployeePassword(employeeEmail,employeePassword);
		if(employee==null)
		{
			return null;
		}
		return employee;

	}

}
