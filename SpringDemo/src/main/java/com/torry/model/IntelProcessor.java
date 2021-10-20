package com.torry.model;

import org.springframework.stereotype.Component;

@Component("i")
public class IntelProcessor implements Processor{
    @Override
    public void process() {
        System.out.println("Intel Processor.....");
    }
}
