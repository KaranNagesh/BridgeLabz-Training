package com.objectmodelling.companyanddepartments;
import java.util.*;

public class Company {
	
	private String companyName;
	private List<Department> departments = new ArrayList<>();
	
	
	public Company(String companyName) {
		this.companyName = companyName;
	}
	
	public void addDepartment(Department department) {
		departments.add(department);
	}
	
	public void closeCompany() {
		departments.clear();
		System.out.println(companyName + " closed. All departments remove.");
	}
}
