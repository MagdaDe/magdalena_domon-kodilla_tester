package com.kodilla.abstracts.homework;

public class Person {

    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public String getFirstName() {
        return firstName;
    }

    public void displayNameAndResponsibilities() {
        System.out.println(getFirstName() + " - obowiązki w pracy jako " + job.getJobName() + " to: " + job.getResponsibilities());
    }

    public static void main(String[] args) {

        Job analyst = new Analyst();
        Job devops = new Devops();
        Job manager = new Manager();
        Job manual = new Manual();
        Job automation = new Automation();
        Job leader = new Leader();

        Person person1 = new Person("Dobrawa", 40, analyst);
        Person person2 = new Person("Andrzej", 43, devops);
        Person person3 = new Person("Krystyna", 37, manager);
        Person person4 = new Person("Magdalena", 36, manual);
        Person person5 = new Person("Jacek", 41, automation);
        Person person6 = new Person("Aneta", 55, leader);

        person1.displayNameAndResponsibilities();
        person2.displayNameAndResponsibilities();
        person3.displayNameAndResponsibilities();
        person4.displayNameAndResponsibilities();
        person5.displayNameAndResponsibilities();
        person6.displayNameAndResponsibilities();
    }
}
