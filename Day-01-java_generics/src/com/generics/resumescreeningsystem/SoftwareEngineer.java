package com.generics.resumescreeningsystem;

public class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName, int experience) {
        super(candidateName, experience);
    }

    @Override
    public void evaluateResume() {
        System.out.println("Evaluating resume for Software Engineer: " + getCandidateName());
        System.out.println("Experience: " + getExperience() + " years - Requires knowledge in Java, C++, and problem-solving.");
    }
}

