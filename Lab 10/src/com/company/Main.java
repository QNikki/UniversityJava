package com.company;

import java.util.stream.Stream;
import java.util.Optional;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();
        Collections.addAll(cities,"Paris", "London", "Madrid","Berlin", "Boston","New York", "Las Vegas", "Gomel");
        cities.forEach(s->System.out.println(s));
        System.out.println("---filter--");
        cities.stream().filter(s->s.length() != 6).forEach(s->System.out.println(s));
        System.out.println("---sort--");
        cities.stream().sorted().forEach(s->System.out.println(s));
        System.out.println("---concat streams--");
        Stream<String> cities1 = Stream.of("Paris", "Madrid", "London");
        Stream<String> cities2 = Stream.of("New York", "Las Vegas", "Boston");
        Stream.concat(cities1, cities2).forEach(n -> System.out.println(n));
        System.out.println("---distinct--");
        Stream<String> citiesNotUnique = Stream.of("Paris", "Madrid", "London","Paris", "Madrid", "London", "Boston","New York");
        citiesNotUnique.distinct().forEach(p -> System.out.println(p));
        System.out.println("---Parallel--");
        Stream<String> wordsStream = Stream.of("One", "Two", "Three", "Four", "Five", "Six");
        String sentence = wordsStream.parallel().reduce("Result:", (x,y)->x + " " + y);
        System.out.println(sentence);
    }
}