package com.company;

public class Cat extends Pet {
    private boolean _quiet;
    public Cat(String name, String colour, int age, boolean quiet) {
        super(name, colour, age);
        _quiet = quiet;

    }

    public boolean isQuiet() {
        return _quiet;
    }

    @Override
    public String toString() {
        return "Cat extends" + super.toString();
    }

    public String cast() {
        return "Meow";
    }
}
