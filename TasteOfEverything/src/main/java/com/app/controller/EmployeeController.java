package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Employee;
import com.app.service.EmployeeService;

@RestController
public class EmployeeController
{
	@Autowired
	private EmployeeService service;

	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) 
	{
		return service.addEmployee(employee);
	}

	public boolean checkEmployee(String emp_email, String emp_password) 
	{
		
		return false;
	}

	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee employee) 
	{
		return service.updateEmployee(employee);
	}

	@GetMapping("/employees")
	public List<Employee> getAllEmployee() 
	{
		return service.getAllEmployee();
	}

	@GetMapping("/employee/{emp_id}")
	public Employee getEmployeeById(@PathVariable int emp_id) 
	{
		return service.getEmployeeById(emp_id);
	}

	@DeleteMapping("/employee/{emp_id}")
	public void deleteEmployeeById(@PathVariable int emp_id) 
	{
		service.deleteEmployeeById(emp_id);
	}
	@GetMapping("/employee/login")
	public Employee getEmployee(@RequestBody Employee employee) throws Exception
	{
		String employeeEmail=employee.getEmployeeEmail();
		String employeePassword=employee.getEmployeePassword();
		return service.getEmployeeByEmailAndPassword(employeeEmail,employeePassword);
	}
}
