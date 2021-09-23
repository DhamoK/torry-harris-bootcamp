package com.torryharris.model;

public class Sedan extends Car {
    int bootSpace;

    public Sedan(String name, String fuelType, int engineCapacity, int noOfGears, double power, Tyre tyre, MusicSystem musicSystem, int bootSpace) {
        super(name, fuelType, engineCapacity, noOfGears, power, tyre, musicSystem);
        this.bootSpace = bootSpace;
    }
    public void displaySedanFeatures(){
        dispalyFeatures();
        System.out.println("No of BootSpace is : "+bootSpace);
    }

    public int getBootSpace() {
        return bootSpace;
    }

    public void setBootSpace(int bootSpace) {
        this.bootSpace = bootSpace;
    }
}
