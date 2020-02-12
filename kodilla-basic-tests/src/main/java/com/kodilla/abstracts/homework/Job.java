package com.kodilla.abstracts.homework;

public abstract class Job {

    int salary;
    String responsibilities;
    String jobName;

    public Job(String jobName, int salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
        this.jobName = jobName;
    }

    public String getJobName() {
        return jobName;
    }

    public String getResponsibilities() {
        return responsibilities;
    }
}