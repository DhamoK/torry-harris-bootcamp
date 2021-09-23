package com.torryharris.model;

public class Bat implements Mammals,Bird{


    @Override
    public void fly() {
        System.out.println("Bat flies lower");
    }

    @Override
    public void feed() {
        System.out.println("Bat feeds pubs");
    }

    @Override
    public void eat() {
        System.out.println("Bat eats insects");
    }

}
