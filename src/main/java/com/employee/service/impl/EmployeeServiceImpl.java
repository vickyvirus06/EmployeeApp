package com.employee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;
import com.employee.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	/***
	 * Get particular employee data
	 */
	@Override
	public Employee getEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).orElse(null);
	}

	/***
	 * Fetch all Employee Data
	 */
	@Override
	public List<Employee> getAllEmployeesData() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee addEmployeeData(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployeeData(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployeeById(Integer id) {
		employeeRepository.deleteById(id);
		
	}

}
