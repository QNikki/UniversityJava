package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("base class Vegetable");
        Vegetable v = new Vegetable();
        System.out.println("constructor without parameters");
        System.out.println(v.toString());
        Vegetable v2 = new Vegetable("Cucumber","green",1.5);
        System.out.println("constructor with parameters");
        System.out.println(v2.toString());
        System.out.println("getting name");
        System.out.println(v2.getName());
        System.out.println("getting colour");
        System.out.println(v2.getColour());
        System.out.println("getting weight");
        System.out.println(v2.getWeight());
        System.out.println("set another name");
        v2.setName("Carrot");
        System.out.println(v2.getName());
        System.out.println("set another colour");
        v2.setColour("Orange");
        System.out.println(v2.getColour());
        System.out.println("set another weight");
        v2.setWeight(3.5);
        System.out.println(v2.getWeight());

    }
}
