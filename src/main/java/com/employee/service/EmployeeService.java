package com.employee.service;

import java.util.List;

import com.employee.entity.Employee;

public interface EmployeeService {

	/***
	 * Get employee by employee Id
	 * @param id
	 * @return
	 */
	public Employee getEmployeeById(Integer id);

	/***
	 * Get all employees data
	 * @return
	 */
	public List<Employee> getAllEmployeesData();

	/***
	 * Add employee Data
	 * @param employee
	 * @return
	 */
	public Employee addEmployeeData(Employee employee);

	/***
	 * Update employee data
	 * @param employee
	 * @return
	 */
	public Employee updateEmployeeData(Employee employee);

	/***
	 * Delete employee data by id
	 * @param id
	 * @return
	 */
	public void deleteEmployeeById(Integer id);
	
	

}
