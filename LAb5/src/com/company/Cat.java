package com.company;

public class Cat extends Pet {
    private boolean quiet;
    public Cat(String name, String colour, int age, boolean quiet) {
        super(name, colour, age);
        this.quiet = quiet;

    }

    public boolean isQuiet() {
        return quiet;
    }

    @Override
    public String toString() {
        return "Cat extends" + super.toString() + "quiet " + quiet;
    }

    public String cast() {
        return "Meow";
    }
}
