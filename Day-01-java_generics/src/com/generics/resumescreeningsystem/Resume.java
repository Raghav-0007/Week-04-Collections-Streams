package com.generics.resumescreeningsystem;

public class Resume<T extends JobRole> {
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public void processResume() {
        System.out.println("\nProcessing Resume for: " + jobRole.getCandidateName());
        jobRole.evaluateResume();
        System.out.println("Resume successfully processed.\n");
    }
}

