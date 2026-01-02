package com.objectmodelling.UniversityManagementSystem;
import java.util.*;

public class UMSStudent {
    private String name;
    private ArrayList<UMSCourse> courses;

    UMSStudent(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }

    String getName() {
        return name;
    }

    void addCourse(UMSCourse course) {
        courses.add(course);
    }

    void viewCourses() {
        System.out.println(name + " is enrolled in:");
        for (UMSCourse c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}