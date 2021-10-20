package com.torry.drive;

import com.torry.model.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Car {
    public static void main(String[] args) {

        ApplicationContext factory = new AnnotationConfigApplicationContext(CarConfig.class);

        Tyre tyre = factory.getBean(Tyre.class);
        tyre.nameOfTyre();

        //Engine engine = factory.getBean(Engine.class);
        Engine engine = (Engine) factory.getBean("engine");
        engine.typeOfEngine();

        MusicSystem m = factory.getBean(MusicSystem.class);
        m.typeOfMusicSystem();

    }
}