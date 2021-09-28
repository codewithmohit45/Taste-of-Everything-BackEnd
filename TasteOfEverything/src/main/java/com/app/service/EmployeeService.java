package com.app.service;

import java.util.List;

import com.app.model.Employee;

public interface EmployeeService 
{
	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public  Employee getEmployeeById(int employeeId);
	public void deleteEmployeeById(int employeeId);
	public Employee getEmployeeByEmployeeEmailAndEmployeePassword(String employeeEmail, String employeePassword)throws Exception;
}
