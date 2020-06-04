package com.company;

public class Dog extends Pet {
    private boolean haveTail;

    public Dog(String name, String colour, int age, boolean haveTail) {
        super(name, colour, age);
        this.haveTail = haveTail;
    }

    public void lostTail() {
        haveTail = false;
    }

    public boolean haveTail() {
        return haveTail;
    }

    @Override
    public String toString() {
        return "Dog extends" + super.toString() + "have tail: " + haveTail;
    }

    public String cast() {
        return "Woof";
    }
}
