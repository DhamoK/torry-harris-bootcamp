package com.torry.drive;

import org.springframework.stereotype.Component;

@Component("s")
public class Sony implements Speaker {
    @Override
    public void nameOfSpeaker() {
        System.out.println("Sony");
    }
}
