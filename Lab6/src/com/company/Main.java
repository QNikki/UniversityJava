package com.company;

public class Main {

    public static void main(String[] args) {
        CollectionPets pets = new CollectionPets(2);
        try {
            pets.Add(new Cat("cat 1", "colour cat 1", 1, false));
            pets.Add(new Cat("cat 2", "colour cat 2", 1, true), 1);
            pets.Add(new Dog("dog 1", "colour dog 1", 1, true));
            pets.Add(new Dog("dog 2", "colour dog 2", 1, false),3);
            for (Pet pet: pets.getPets()) {
                System.out.println(pet);
            }

            pets.Delete(1);
            pets.DeleteFirstName("dog 2");
            for (Pet pet: pets.getPets()) {
                System.out.println(pet.toString());
            }

            System.out.println(pets.SearchByName("cat 1"));
            pets.ReplaceFirstName("cat 1", new Cat("cat 3", " colour 3", 3, true));
            System.out.println(pets.SearchByName("cat 3"));
        }
        catch (ValidationException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
