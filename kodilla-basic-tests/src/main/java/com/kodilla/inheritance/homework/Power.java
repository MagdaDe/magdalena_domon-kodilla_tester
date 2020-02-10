package com.kodilla.inheritance.homework;

public class Power {
    public static void main(String[] args) {
        OperatingSystem opSystem = new OperatingSystem(2017, "Oreo");
        opSystem.displayReleaseYear();
        opSystem.turnOn();
        opSystem.turnOff();
        System.out.println();

        AndroidOld oldSystem = new AndroidOld(2008, "Apple Pie");
        oldSystem.displayReleaseYear();
        oldSystem.turnOn();
        oldSystem.turnOff();
        System.out.println();

        AndroidNew newSystem = new AndroidNew(2019, "Android 10");
        newSystem.displayReleaseYear();
        newSystem.turnOn();
        newSystem.turnOff();
        System.out.println();
    }
}