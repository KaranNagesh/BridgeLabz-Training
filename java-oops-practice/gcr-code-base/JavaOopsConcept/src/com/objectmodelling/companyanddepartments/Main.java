package com.objectmodelling.companyanddepartments;

public class Main {
	public static void main(String[] args) {
		Company company1 = new Company("Housing one");
		
		Department finance = new Department("Finance");
		Department iT = new Department("IT");
		Department sales = new Department("Sales");
		company1.addDepartment(finance);
		company1.addDepartment(iT);
		company1.addDepartment(sales);
		
		Employee employee1 = new Employee("Karan");
		Employee employee2 = new Employee("Ansh");
		Employee employee3 = new Employee("Jaya");
		
		finance.addEmployee(employee2);
		iT.addEmployee(employee1);
		sales.addEmployee(employee3);
		
		finance.showEmployee();
		
		
		company1.closeCompany();
		
	}
}
