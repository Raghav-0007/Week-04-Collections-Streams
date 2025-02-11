package com.generics.resumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create different job role resumes
        SoftwareEngineer seCandidate = new SoftwareEngineer("Alice Johnson", 5);
        DataScientist dsCandidate = new DataScientist("Bob Smith", 3);
        ProductManager pmCandidate = new ProductManager("Charlie Brown", 7);

        // Process individual resumes using the generic class
        Resume<SoftwareEngineer> seResume = new Resume<>(seCandidate);
        Resume<DataScientist> dsResume = new Resume<>(dsCandidate);
        Resume<ProductManager> pmResume = new Resume<>(pmCandidate);

        seResume.processResume();
        dsResume.processResume();
        pmResume.processResume();

        // Using wildcards to screen multiple resumes dynamically
        List<JobRole> candidateList = new ArrayList<>();
        candidateList.add(seCandidate);
        candidateList.add(dsCandidate);
        candidateList.add(pmCandidate);

        System.out.println("\n--- Bulk Resume Screening ---");
        ResumeScreeningPipeline.screenResumes(candidateList);
    }
}

