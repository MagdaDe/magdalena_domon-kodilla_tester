package com.kodilla.inheritance.homework;

public class AndroidNew extends OperatingSystem {
    public AndroidNew(int released, String name) {
        super(released, name);
    }

    @Override
    public void turnOn() {
        System.out.println("OS is turning on very quickly...");
    }

    @Override
    public void turnOff() {
        System.out.println("OS " + getName() + " is turning off...");
    }
}
