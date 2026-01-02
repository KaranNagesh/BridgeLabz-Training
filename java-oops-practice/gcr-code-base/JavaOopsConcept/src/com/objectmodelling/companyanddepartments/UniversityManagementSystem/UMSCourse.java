package com.objectmodelling.companyanddepartments.UniversityManagementSystem;
import java.util.*;
public class UMSCourse {
    private String courseName;
    private UMSProfessor professor; 
    private ArrayList<UMSStudent> students; 

    UMSCourse(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<>();
    }

    void assignProfessor(UMSProfessor professor) {
        this.professor = professor;
        professor.addCourse(this);
        System.out.println(professor.getName() + " assigned to " + courseName);
    }

    void enrollStudent(UMSStudent student) {
        students.add(student);
        student.addCourse(this);
        System.out.println(student.getName() + " enrolled in " + courseName);
    }

    void displayCourse() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Professor: " + professor.getName());
        }
        System.out.println("Enrolled Students:");
        for (UMSStudent s : students) {
            System.out.println("- " + s.getName());
        }
    }

    String getCourseName() {
        return courseName;
    }
}