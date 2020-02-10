package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int released;
    private String name;

    public OperatingSystem(int released, String name) {
        this.released = released;
        this.name = name;
    }

    public int getReleased() {
        return released;
    }

    public String getName() {
        return name;
    }

    public void turnOn() {
        System.out.println("OS is turning on...");
    }

    public void turnOff() {
        System.out.println("OS " + getName() + " is turning off...");
    }

    public void displayReleaseYear() {
        System.out.println("This OS was released in " + released);
    }
}
