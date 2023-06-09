package com.example.rest.employee.service;

import java.util.List;

import com.example.rest.employee.entity.Employee;

public interface EmployeeService {
	
	List<Employee> findAll();
	
    Employee findById(int theId);
	
	Employee save(Employee theEmployee);
	
	void deleteById(int theId);
	
}

