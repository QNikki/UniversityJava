package com.company;

public class Dog extends Pet {
    private boolean _haveTail;

    public Dog(String name, String colour, int age, boolean haveTail) {
        super(name, colour, age);
        _haveTail = haveTail;
    }

    public void lostTail() {
        _haveTail = false;
    }

    public boolean haveTail() {
        return _haveTail;
    }

    @Override
    public String toString() {
        return "Dog extends" + super.toString();
    }

    public String cast() {
        return "Woof";
    }
}
