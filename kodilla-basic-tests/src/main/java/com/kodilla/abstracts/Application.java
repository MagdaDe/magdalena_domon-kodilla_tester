package com.kodilla.abstracts;

public class Application {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.giveVoice();
        dog.getNumberOfLegs();

        AnimalProcessor processor = new AnimalProcessor();
        processor.process(dog);

        Duck duck = new Duck();
        duck.giveVoice();
        duck.getNumberOfLegs();
    }
}
