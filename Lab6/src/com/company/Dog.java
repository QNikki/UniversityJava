package com.company;

public class Dog extends Pet{
    public Dog(String name, String colour, int age) {
        super(name, colour, age);
    }

    @Override
    public String toString() {
        return "Dog extends" + super.toString();
    }

    public String cast() {
        return "Woof";
    }
}
