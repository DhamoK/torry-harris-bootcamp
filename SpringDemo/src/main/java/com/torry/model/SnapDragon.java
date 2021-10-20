package com.torry.model;

import org.springframework.stereotype.Component;

@Component("s")
public class SnapDragon implements Processor{
    @Override
    public void process() {
        System.out.println("SnapDragon Processor.....");
    }
}
