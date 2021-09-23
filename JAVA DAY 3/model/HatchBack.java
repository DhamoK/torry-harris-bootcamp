package com.torryharris.model;

public class HatchBack extends Car {
    String steeringType;

    public HatchBack(String name, String fuelType, int engineCapacity, int noOfGears, double power, Tyre tyre, MusicSystem musicSystem, String steeringType) {
        super(name, fuelType, engineCapacity, noOfGears, power, tyre, musicSystem);
        this.steeringType = steeringType;
    }
    public void displayHatchBackFeatures(){
        dispalyFeatures();
        System.out.println("Steering Type is: "+steeringType);
    }

    public String getSteeringType() {
        return steeringType;
    }

    public void setSteeringType(String steeringType) {
        this.steeringType = steeringType;
    }
}
