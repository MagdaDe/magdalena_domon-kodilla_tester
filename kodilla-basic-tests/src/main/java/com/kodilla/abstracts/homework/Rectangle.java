package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void perimeter() {
        System.out.println("Obwód prostokąta wynosi: " + 2*(a+b));
    }

    @Override
    public void area() {
        System.out.println("Pole prostokąta wynosi: " + a*b);
    }
}
