package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.database.databaseClass;
import com.model.Employee;

public class employeeService {

	private Map<Long, Employee> employees = databaseClass.getEmployees();

	public employeeService(){
		employees.put(1L, new Employee(1, "Sandeep"));
		employees.put(2L, new Employee(2, "Sam"));
		employees.put(3L, new Employee(3, "Johnson"));
	}
	public List<Employee> getAllEmployees() {
		return new ArrayList<Employee>(employees.values());
	}

	public Employee getEmployee(long id) {
		return employees.get(id);
	}

	public Employee addEmployee(Employee employee) {
		employee.setId(employees.size() + 1);
		employees.put(employee.getId(), employee);
		return employee;
	}

	public Employee editEmployee(Employee employee) {
		if (employee.getId() <= 0) {
			return null;
		}
		employees.put(employee.getId(), employee);
		return employee;
	}

	public Employee removeEmployee(long id) {
		return employees.remove(id);
	}

}
