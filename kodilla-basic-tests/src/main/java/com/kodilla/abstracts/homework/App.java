package com.kodilla.abstracts.homework;

public class App {

    public static void main(String[] args) {

        Shape triangle = new Triangle(3,4,5,3);
        triangle.perimeter();
        triangle.area();

        Rectangle rectangle = new Rectangle(1,3);
        Shape square = new Square(5);

        ShapeProc processor = new ShapeProc();
        processor.process(rectangle);
        processor.process(square);
    }
}
