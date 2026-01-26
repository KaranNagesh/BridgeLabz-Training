package com.javastreams.serialization;
import java.util.*;
import java.io.*;

public class Main {
	
	public static final String filePath = "src/com/javastreams/serialization/EmployeeData.txt";
	
	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee(101,"Karan" , "IT",50000));
		employees.add(new Employee(102 , "Mayamk" ,"Sales" , 35000));
		employees.add(new Employee(103 ,"Priya" ,"HR" , 15000));
		
		serializeEmployees(employees);
		
        deserializeEmployees();
		
	}
	
    private static void serializeEmployees(List<Employee> employees) {

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(filePath))) {

            oos.writeObject(employees);
            System.out.println("Employees serialized successfully.");

        } catch (IOException e) {
            System.out.println("Error during serialization.");
            e.printStackTrace();
        }
    }
	
    @SuppressWarnings("unchecked")
    private static void deserializeEmployees() {

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(filePath))) {

            List<Employee> employees =
                    (List<Employee>) ois.readObject();

            System.out.println("\nDeserialized Employee Details:");
            for (Employee emp : employees) {
                emp.display();
            }

        } catch (IOException e) {
            System.out.println("Error during deserialization.");
            e.printStackTrace();

        } catch (ClassNotFoundException e) {
            System.out.println("Employee class not found.");
            e.printStackTrace();
        }
    }
	
}
