package com.company;

public class CollectionPets {
    private Pet[] pets;
    private int count;

    public CollectionPets(int size) {
        pets = new Pet[size];
        count = 0;
    }
    
    public void Add(Pet pet) throws ValidationException {
        if (pets.length == count) {
            expandCollection();
            count *= 2;
        }

        int index = FirstFree();
        pets[index] = pet;
        count++;
    }

    public int getCount() {
        return count;
    }

    public void Add(Pet pet, int index) throws ValidationException {
        if (pets.length == count) {
            expandCollection();
            count *= 2;
        }

        if(pets.length < index || index < 0) {
            throw  new ValidationException("Index most be > 0 an < size");
        }

        if(pets[index] != null) {
            throw new ValidationException("index is busy");
        }

        pets[index] = pet;
        count++;
    }

    public void Delete(int index) throws ValidationException {
        if(pets.length < index || index < 0) {
            throw  new ValidationException("Index most be > 0 and < size");
        }

        pets[index] = null;
    }

    public void DeleteFirstName(String name) throws ValidationException {
        int index = FirstWithName(name);
        if(index == -1) {
            throw  new ValidationException("Not found pet with this name");
        }
        else {
            Delete(index);
        }
    }

    public Pet SearchByName(String name) throws ValidationException {
        int index = FirstWithName(name);
        if(index == -1) {
            throw  new ValidationException("Not found pet with this name");
        }
        else {
            return pets[index];
        }
    }

    public Pet[] SearchByNameArray(String name) throws ValidationException {
        int index = FirstWithName(name);
        if(index == -1) {
            throw  new ValidationException("Not found pet with this name");
        }
        else {
            Pet[] res = AllWithName(name);
            return res;
        }
    }

    public void Replace(int index, Pet pet) throws ValidationException {
        if(pets.length < index || index < 0) {
            throw  new ValidationException("Index most be > 0 an < size");
        }

        pets[index] = pet;
    }

    public void ReplaceFirstName(String name, Pet pet) throws ValidationException {
        int index = FirstWithName(name);
        if (index != -1) {
            pets[index] = pet;
        }
        else {
            throw new ValidationException("Not found pet with this name");
        }

    }

    public Pet getPet(int index) throws ValidationException {
        if(pets.length < index || index < 0) {
            throw  new ValidationException("Index most be > 0 an < size");
        }

        return pets[index];
    }

    public Pet[] getPets() {
        int n = 0;
        for(int i = 0; i < pets.length; i++) {
            if (pets[i] != null) {
                n++;
            }
        }

        Pet[] result = new Pet[n];
        for(int i = 0, j = 0; i < pets.length; i++) {
            if (pets[i] != null) {
                result[j++] = pets[i];
            }
        }
        return  result;
    }

    private int FirstFree() {
        int index = 0;
        while (pets[index] != null && pets.length > index) { index++; }

        return index;
    }

    private int FirstWithName(String name) {
        int index = 0;
        int res = -1;
        while (res == -1 && index < pets.length) {
            if (pets[index] == null)
            {
                index++;
            }
            else {
                if (name.equalsIgnoreCase(pets[index].Name)) {
                    res = index;
                }

                index++;
            }
        }
        return res;
    }

    private Pet[] AllWithName(String name) {
        int[] searchMark = new int[pets.length];
        for (int i = 0; i < pets.length; i++) {
            if(name.equalsIgnoreCase(pets[i].Name)) {
                searchMark[i] = 1;
            }
            else {
                searchMark[i] = 0;
            }
        }

        int n = 0;
        for (int i: searchMark) {
            n += i;
        }

        if (n == 0) {
            return null;
        }
        else {
            Pet[] res = new Pet[n];
            for ( int i = 0, j = 0; i < searchMark.length; i++) {
                if(searchMark[i] == 1) {
                    res[j++] = pets[i];
                }
            }

            return res;
        }
    }

    private void expandCollection() {
        Pet[] expandedArr = new Pet[pets.length + count];
        for (int i = 0; i < pets.length; i++) {
            expandedArr[i] = pets[i];
        }
        pets = expandedArr;
    }
}
