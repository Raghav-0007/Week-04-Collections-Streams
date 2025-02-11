package com.generics.universitycoursemanagement;

import java.util.List;

public class CourseCatalog {
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println("Available Course: " + course.getCourseName());
            course.evaluate();
        }
    }
}

