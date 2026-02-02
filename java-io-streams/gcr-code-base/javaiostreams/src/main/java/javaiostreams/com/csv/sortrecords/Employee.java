package javaiostreams.com.csv.sortrecords;


//Employee POJO class
public class Employee {

	private String id;
	private String name;
	private String department;
	private int salary;

	public Employee(String id, String name, String department, int salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public String toString() {
		return "ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: " + salary;
	}
}
