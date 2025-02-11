package com.generics.universitycoursemanagement;

public class Course<T extends CourseType> {
    private T courseType;

    public Course(T courseType) {
        this.courseType = courseType;
    }

    public void showCourseDetails() {
        System.out.println("Course: " + courseType.getCourseName());
        courseType.evaluate();
    }
}

