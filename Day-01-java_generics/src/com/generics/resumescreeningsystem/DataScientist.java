package com.generics.resumescreeningsystem;

public class DataScientist extends JobRole {
    public DataScientist(String candidateName, int experience) {
        super(candidateName, experience);
    }

    @Override
    public void evaluateResume() {
        System.out.println("Evaluating resume for Data Scientist: " + getCandidateName());
        System.out.println("Experience: " + getExperience() + " years - Requires knowledge in Python, Machine Learning, and SQL.");
    }
}

