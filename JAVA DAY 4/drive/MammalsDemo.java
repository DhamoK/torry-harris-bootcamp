package com.torryharris.drive;

import com.torryharris.model.Bat;
import com.torryharris.model.Cow;
import com.torryharris.model.Mammals;
import com.torryharris.model.Tiger;

public class MammalsDemo {
    public static void main(String[] args) {
        Cow cow = new Cow();
        System.out.println();
        cow.eat();
        cow.feed();
        System.out.println();
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.feed();
        System.out.println();
        Mammals c = new Cow();
        cow.eat();
        cow.feed();
        System.out.println();
        Mammals t = new Tiger();
        tiger.eat();
        tiger.feed();

        Bat bat = new Bat();
        bat.eat();
    }
}
