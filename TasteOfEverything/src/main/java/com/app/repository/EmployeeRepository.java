package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{

	Employee findEmployeeByEmployeeEmailAndEmployeePassword(String employeeEmail, String employeePassword);
	//boolean findByEmployee(String emp_username,String emp_password);
}
