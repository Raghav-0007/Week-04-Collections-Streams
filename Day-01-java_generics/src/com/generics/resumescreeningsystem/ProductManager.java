package com.generics.resumescreeningsystem;

public class ProductManager extends JobRole {
    public ProductManager(String candidateName, int experience) {
        super(candidateName, experience);
    }

    @Override
    public void evaluateResume() {
        System.out.println("Evaluating resume for Product Manager: " + getCandidateName());
        System.out.println("Experience: " + getExperience() + " years - Requires leadership, market research, and strategy skills.");
    }
}

