package com.database;

import java.util.HashMap;
import java.util.Map;

import com.model.Employee;

public class databaseClass {

	private static Map<Long, Employee> employees = new HashMap<>();

	public static Map<Long, Employee> getEmployees() {
		return employees;
	}

}
