package com.torryharris.model;

public class AirIndia implements AirPlane{
    @Override
    public void fly() {
        System.out.println("AirIndia Flies Higher....");
    }
    @Override
    public void move() {
        System.out.println("AirIndia is moving.....");
    }
}
