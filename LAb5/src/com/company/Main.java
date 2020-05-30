package com.company;

import java.io.Console;

public class Main {

    public static void main(String[] args) {
        Pet cat = new Cat("Vasya","Orange",3);
        System.out.println(cat.toString());
        System.out.println(cat.cast());
        Pet dog = new Dog("Brosha","Mixed",2);
        System.out.println(dog.toString());
        System.out.println(dog.cast());

    }
}
