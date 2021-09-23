package com.torryharris.model;

public class Tiger implements Mammals{
    @Override
    public void feed() {
        System.out.println("Tiger feeds Cubs");
    }

    @Override
    public void eat() {
        System.out.println("Tiger eats fleshes");
    }
}