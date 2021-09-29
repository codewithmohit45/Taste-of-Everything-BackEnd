package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin
public class EmployeeController
{
	@Autowired
	private EmployeeService service;

	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) 
	{
		return service.addEmployee(employee);
	}

	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee employee) 
	{
		return service.updateEmployee(employee);
	}

	@GetMapping("/employees")
	public List<Employee> getAllEmployees() 
	{
		return service.getAllEmployees();
	}

	@GetMapping("/employee/{employeeId}")
	public Employee getEmployeeById(@PathVariable int employeeId) 
	{
		return service.getEmployeeById(employeeId);
	}

	@DeleteMapping("/employee/{employeeId}")
	public void deleteEmployeeById(@PathVariable int employeeId) 
	{
		service.deleteEmployeeById(employeeId);
	}
	
	@GetMapping("/employee/login/{employeeEmail}/{employeePassword}")
	public Employee getEmployee(@PathVariable String employeeEmail,@PathVariable String employeePassword) throws Exception {
		return service.getEmployeeByEmployeeEmailAndEmployeePassword(employeeEmail,employeePassword);
	}
}
