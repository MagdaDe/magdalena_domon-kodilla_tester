package com.kodilla.abstracts.homework;

public class Square extends Shape {

    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public void perimeter() {
        System.out.println("Obwód kwadratu wynosi: " + 4*a);
    }

    @Override
    public void area() {
        System.out.println("Pole kwadratu wynosi: " + a*a);
    }
}
