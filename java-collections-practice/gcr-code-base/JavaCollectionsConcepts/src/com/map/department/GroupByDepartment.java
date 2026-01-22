package com.map.department;


import java.util.*;

public class GroupByDepartment {

	// Method to group employees by department
	static Map<String, List<Employee>> groupEmployeesByDepartment(List<Employee> employees) {

		Map<String, List<Employee>> departmentMap = new HashMap<>();

		// Traverse employee list
		for (Employee emp : employees) {

			String dept = emp.getDepartment();

			// Create list if department not present
			departmentMap.putIfAbsent(dept, new ArrayList<>());

			// Add employee to department list
			departmentMap.get(dept).add(emp);
		}

		return departmentMap;
	}

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Alice", "HR"));
		employees.add(new Employee("Bob", "IT"));
		employees.add(new Employee("Carol", "HR"));

		Map<String, List<Employee>> grouped = groupEmployeesByDepartment(employees);

		// Print grouped employees
		for (Map.Entry<String, List<Employee>> entry : grouped.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}