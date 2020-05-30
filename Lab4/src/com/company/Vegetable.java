package com.company;

public class Vegetable {
    private String _name;
    private String _colour;
    private double _weight;

    public Vegetable(String name, String colour, double weight)
    {
        _name = name;
        _colour = colour;
        _weight = weight;
    }
    public  Vegetable()
    {
        _name = "";
        _colour = "";
        _weight = 0.0;
    }

    public double getWeight() {
        return _weight;
    }

    public String getColour() {
        return _colour;
    }

    public String getName() {
        return _name;
    }

    public void setColour(String colour) {
        _colour = colour;
    }

    public void setWeight(double weight) {
        if  (_weight > 0.0) {
            _weight = weight;
        }
    }

    public void setName(String name) {
        _name = name;
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "name='" + _name + '\'' +
                ", colour='" + _colour + '\'' +
                ", weight=" + _weight +
                '}';
    }
}
