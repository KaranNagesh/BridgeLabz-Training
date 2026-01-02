package com.objectmodelling.UniversityManagementSystem;

import java.util.ArrayList;

public class UMSProfessor {
    private String name;
    private ArrayList<UMSCourse> courses;

    UMSProfessor(String name) {
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
        System.out.println(name + " teaches:");
        for (UMSCourse c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}