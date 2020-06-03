package com.company;

public class CollectionPets {
    private Pet[] _pets;
    private int _count;

    public CollectionPets(int size) {
        _pets = new Pet[size];
        _count = 0;
    }
    
    public void Add(Pet pet) throws ValidationException {
        if (_pets.length == _count) {
            expandCollection();
            _count *= 2;
        }

        int index = FirstFree();
        _pets[index] = pet;
        _count++;
    }

    public int getCount() {
        return _count;
    }

    public void Add(Pet pet, int index) throws ValidationException {
        if (_pets.length == _count) {
            expandCollection();
            _count *= 2;
        }

        if(_pets.length < index || index < 0) {
            throw  new ValidationException("Index most be > 0 an < size");
        }

        if(_pets[index] != null) {
            throw new ValidationException("index is busy");
        }

        _pets[index] = pet;
        _count++;
    }

    public void Delete(int index) throws ValidationException {
        if(_pets.length < index || index < 0) {
            throw  new ValidationException("Index most be > 0 and < size");
        }

        _pets[index] = null;
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
            return _pets[index];
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
        if(_pets.length < index || index < 0) {
            throw  new ValidationException("Index most be > 0 an < size");
        }

        _pets[index] = pet;
    }

    public void ReplaceFirstName(String name, Pet pet) throws ValidationException {
        int index = FirstWithName(name);
        if (index != -1) {
            _pets[index] = pet;
        }
        else {
            throw new ValidationException("Not found pet with this name");
        }

    }

    public Pet getPet(int index) throws ValidationException {
        if(_pets.length < index || index < 0) {
            throw  new ValidationException("Index most be > 0 an < size");
        }

        return _pets[index];
    }

    public Pet[] getPets() {
        int n = 0;
        for(int i = 0; i < _pets.length; i++) {
            if (_pets[i] != null) {
                n++;
            }
        }

        Pet[] result = new Pet[n];
        for(int i = 0, j = 0; i < _pets.length; i++) {
            if (_pets[i] != null) {
                result[j++] = _pets[i];
            }
        }
        return  result;
    }

    private int FirstFree() {
        int index = 0;
        while (_pets[index] != null && _pets.length > index) { index++; }

        return index;
    }

    private int FirstWithName(String name) {
        int index = 0;
        int res = -1;
        while (res == -1 && index < _pets.length) {
            if (_pets[index] == null)
            {
                index++;
            }
            else {
                if (name.equalsIgnoreCase(_pets[index].Name)) {
                    res = index;
                }

                index++;
            }
        }
        return res;
    }

    private Pet[] AllWithName(String name) {
        int[] searchMark = new int[_pets.length];
        for ( int i = 0; i < _pets.length; i++) {
            if(name.equalsIgnoreCase(_pets[i].Name)) {
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
                    res[j++] = _pets[i];
                }
            }

            return res;
        }
    }

    private void expandCollection() {
        Pet[] expandedArr = new Pet[_pets.length + _count];
        for (int i = 0; i < _pets.length; i++) {
            expandedArr[i] = _pets[i];
        }
        _pets = expandedArr;
    }
}
