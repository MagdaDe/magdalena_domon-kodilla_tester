package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    private int a;
    private int b;
    private int c;
    private int h;

    public Triangle(int a, int b, int c, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public void perimeter() {
        System.out.println("Obwód trójkąta wynosi: " + (a+b+c));
    }

    @Override
    public void area() {
        System.out.println("Pole trójkąta wynosi: " + 0.5*a*h);
    }
}
