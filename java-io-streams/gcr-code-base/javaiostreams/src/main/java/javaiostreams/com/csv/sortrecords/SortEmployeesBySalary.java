package javaiostreams.com.csv.sortrecords;

import java.io.BufferedReader; // For reading CSV file
import java.io.InputStreamReader; // Converts byte stream to character stream
import java.io.IOException; // Handles IO exceptions
import java.util.ArrayList; // Stores employee records
import java.util.Collections; // Used for sorting
import java.util.List; // List interface

public class SortEmployeesBySalary {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>(); // List to store employees

		try (BufferedReader br = new BufferedReader(new InputStreamReader(
				// Load CSV file from resources folder
				SortEmployeesBySalary.class.getClassLoader().getResourceAsStream("data/csv/employees.csv")))) {

			String line;
			boolean isHeader = true; // Flag to skip header row

			// Read CSV file line by line
			while ((line = br.readLine()) != null) {

				// Skip header row
				if (isHeader) {
					isHeader = false;
					continue;
				}

				// Split CSV row
				String[] data = line.split(",");

				// Create Employee object
				Employee emp = new Employee(data[0], data[1], data[2], Integer.parseInt(data[3]));

				// Add employee to list
				employees.add(emp);
			}

			// Sort employees by salary in descending order
			Collections.sort(employees, (e1, e2) -> Integer.compare(e2.getSalary(), e1.getSalary()));

			// Print top 5 highest-paid employees
			System.out.println("Top 5 Highest-Paid Employees:");
			System.out.println("--------------------------------");

			for (int i = 0; i < Math.min(5, employees.size()); i++) {
				System.out.println(employees.get(i));
			}

		} catch (IOException e) {
			// Handle file reading exceptions
			e.printStackTrace();
		}
	}
}
