package com.generics.universitycoursemanagement;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create different course types
        ExamCourse math = new ExamCourse("Mathematics");
        AssignmentCourse english = new AssignmentCourse("English Literature");
        ResearchCourse physics = new ResearchCourse("Quantum Physics");

        // Manage courses using generic class
        Course<ExamCourse> mathCourse = new Course<>(math);
        Course<AssignmentCourse> englishCourse = new Course<>(english);
        Course<ResearchCourse> physicsCourse = new Course<>(physics);

        mathCourse.showCourseDetails();
        englishCourse.showCourseDetails();
        physicsCourse.showCourseDetails();

        // Managing multiple courses using wildcards
        List<CourseType> courseList = new ArrayList<>();
        courseList.add(math);
        courseList.add(english);
        courseList.add(physics);

        System.out.println("\nDisplaying all available courses:");
        CourseCatalog.displayCourses(courseList);
    }
}

