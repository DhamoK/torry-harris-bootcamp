package com.torryharris.model;

public class Triangle extends Shape{
    private int length;
    private int breadth;

    public Triangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        setNoOfSides(3);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    @Override
    public void area() {
        System.out.println("Area of Triangle :"+(length*breadth/2));
    }
}
