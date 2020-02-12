package com.kodilla.abstracts.homework;

public abstract class Job {

    private int salary;
    private String responsibilities;
    private String jobName;

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