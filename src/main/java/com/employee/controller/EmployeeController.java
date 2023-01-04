package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(value = "/getAllEmployees")
	public List<Employee> getAllEmployeesData(@RequestParam @NonNull Integer id){
		return employeeService.getAllEmployeesData();
		
	}
	
	@GetMapping(value = "/getEmployeeById/{id}")
	public Employee getEmployeeById(@RequestParam @NonNull Integer id){
		return employeeService.getEmployeeById(id);
		
	}
	
	@PostMapping(value = "/addEmployee/")
	public Employee addEmployeeData(@RequestBody Employee employee) {
		return employeeService.addEmployeeData(employee);
	}
	
	@PostMapping(value = "/updateEmployee/")
	public Employee updateEmployeeData(@RequestBody Employee employee) {
		return employeeService.updateEmployeeData(employee);
	}
	
	@DeleteMapping(value = "/deleteEmployeeById/")
	public void deleteEmployeeData(@RequestParam @NonNull Integer id) {
		employeeService.deleteEmployeeById(id);
	}
}
