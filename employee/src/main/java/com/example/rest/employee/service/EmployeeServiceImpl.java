package com.example.rest.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.rest.employee.dao.EmployeeDAO;
import com.example.rest.employee.entity.Employee;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDAO employeeDAO;
	
	public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO) {
		employeeDAO = theEmployeeDAO;
	}
	
	@Transactional
	@Override
	public List<Employee> findAll() {
		
		return employeeDAO.findAll();
	}
	
	@Transactional
	@Override
	public Employee findById(int theId) {
		return employeeDAO.findById(theId);
	}
	
	@Transactional
	@Override
	public Employee save(Employee theEmployee) {
		return employeeDAO.save(theEmployee);
	}
	
	@Transactional
	@Override
	public void deleteById(int theId) {
		employeeDAO.deleteById(theId);
		
	}

}
