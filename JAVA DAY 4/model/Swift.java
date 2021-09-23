package com.torryharris.model;

import java.sql.SQLOutput;

public class Swift implements Car{

    @Override
    public void changeGear() {
        System.out.println("Swift Changing its gear.....");
    }

    @Override
    public void move() {
        System.out.println("Car is moving..");
    }
}
