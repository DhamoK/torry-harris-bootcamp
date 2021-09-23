package com.torryharris.drive;

import com.torryharris.model.*;

public class VehicleDemo {
    public static void main(String[] args) {
        Car c = new Swift();
        c.changeGear();
        c.move();
        System.out.println();
        Boat b = new Titanic();
        b.Float();
        b.move();
        System.out.println();
        AirPlane a = new AirIndia();
        a.fly();
        a.move();
    }
}
