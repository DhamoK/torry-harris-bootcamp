package com.torryharris.model;

public class Cow implements Mammals{
    @Override
    public void feed() {
        System.out.println("Cow feeds Calves");
    }

    @Override
    public void eat() {
        System.out.println("Cow eats grasses");
    }
}
