package com.kodilla.inheritance.homework;

public class AndroidOld extends OperatingSystem {
    public AndroidOld(int released, String name) {
        super(released, name);
    }

    @Override
    public void turnOn() {
        System.out.println("OS is turning on very slowly...");
    }

    @Override
    public void turnOff() {
        System.out.println("OS " + getName() + " is turning off...");
    }
}
