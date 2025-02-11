package com.generics.resumescreeningsystem;

import java.util.List;

public class ResumeScreeningPipeline {
    public static void screenResumes(List<? extends JobRole> candidates) {
        System.out.println("\n--- AI-Driven Resume Screening System ---");
        for (JobRole candidate : candidates) {
            System.out.println("Screening Resume for: " + candidate.getCandidateName());
            candidate.evaluateResume();
            System.out.println("Resume Screening Completed.\n");
        }
    }
}

