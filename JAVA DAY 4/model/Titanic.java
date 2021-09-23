package com.torryharris.model;

public class Titanic implements Boat {

    @Override
    public void Float() {
        System.out.println("Boat floats in Water..");
    }

    @Override
    public void move() {
        System.out.println("Titanic is moving...");
    }
}
