package com.torry.drive;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("p")
@Primary
public class Panasonic implements Speaker{
    @Override
    public void nameOfSpeaker() {
        System.out.println("Panasonic.....");
    }
}
