package com.company;

public class Cat extends Pet {
    public Cat(String name, String colour, int age) {
        super(name, colour, age);
    }

    @Override
    public String toString() {
        return "Cat extends" + super.toString();
    }

    public String cast() {
        return "Meow";
    }
}
