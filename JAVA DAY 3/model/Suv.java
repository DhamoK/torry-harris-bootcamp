package com.torryharris.model;

public class Suv extends Car {
    String driveModes;
    boolean sunRoof;

    public Suv(String name, String fuelType, int engineCapacity, int noOfGears, double power,
               Tyre tyre, MusicSystem musicSystem, String driveModes, boolean sunRoof) {
        super(name, fuelType, engineCapacity, noOfGears, power, tyre, musicSystem);
        this.driveModes = driveModes;
        this.sunRoof = sunRoof;
    }
    public void displaySuvFeatures() {
        dispalyFeatures();
        System.out.println("The drive mode is : " + driveModes);
        System.out.println("Sunroof is : " + sunRoof);
    }
    public String getDriveModes() {
        return driveModes;
    }

    public void setDriveModes(String driveModes) {
        this.driveModes = driveModes;
    }

    public boolean isSunRoof() {
        return sunRoof;
    }

    public void setSunRoof(boolean sunRoof) {
        this.sunRoof = sunRoof;
    }
}

