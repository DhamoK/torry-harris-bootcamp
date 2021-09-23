package com.torryharris.model;

public class Rectangle extends Shape{
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        setNoOfSides(4);
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
        System.out.println("Area of Rectangle :"+(length*breadth));
    }
}
