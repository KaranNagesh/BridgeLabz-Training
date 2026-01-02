package com.objectmodelling.universitywithfacultyanddepartment;

//Importing ArrayList  and List from java.util package
import java.util.ArrayList;
import java.util.List;

public class University {
	//Private instance of class
  private List<Department> departments = new ArrayList<>();

  //Public method to add department
  public void addDepartment(Department department) {
      departments.add(department);
  }

  //public method to close university
  public void closeUniversity() {
      departments.clear();
      System.out.println("University closed. Departments removed.");
  }
}