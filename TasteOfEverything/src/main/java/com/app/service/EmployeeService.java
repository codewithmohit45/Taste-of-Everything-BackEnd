package com.app.service;

import java.util.List;

import com.app.model.Employee;

public interface EmployeeService 
{
	public Employee addEmployee(Employee employee);
	public boolean checkEmployee(String employeeEmail,String employeePassword);
	public Employee updateEmployee(Employee employee);
	public List<Employee> getAllEmployee();
	public  Employee getEmployeeById(int employeeId);
	public void deleteEmployeeById(int employeeId);
}
