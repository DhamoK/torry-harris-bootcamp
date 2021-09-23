package com.torryharris.drive;

import com.torryharris.model.Bat;
import com.torryharris.model.Bird;
import com.torryharris.model.Peacock;
import com.torryharris.model.Pegion;

public class BirdDemo {
    public static void main(String[] args) {
        Peacock peacock = new Peacock();
        peacock.fly();
        peacock.eat();

        Pegion pegion = new Pegion();
        pegion.fly();
        pegion.eat();

        Bird pon = new Pegion();
        pon.fly();
        pon.eat();

        pon = new Peacock();
        pon.eat();
        pon.fly();

        Bat bat = new Bat();
        bat.eat();

    }

}
