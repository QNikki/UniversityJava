package com.company;

public abstract class Pet {
    protected String Name;
    protected String Colour;
    protected int Age;

    Pet(String name, String colour, int age) {
        Name = name;
        Colour = colour;
        Age = age;
    }

    public int getAge() {
        return Age;
    }

    public String getColour() {
        return Colour;
    }

    public String getName() {
        return Name;
    }

    public void setAge(int age) {
        if(age > 0) {
            Age = age;
        }
    }

    public void setName(String name) {
        Name = name;
    }

    public void setColour(String colour) {
        Colour = colour;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "Name='" + Name + '\'' +
                ", Colour='" + Colour + '\'' +
                ", Age=" + Age +
                '}';
    }

     public abstract String cast();
}
