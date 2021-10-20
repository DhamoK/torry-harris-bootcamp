package org.example;

import com.torry.model.AppConfig;
import com.torry.model.HardDisk;
import com.torry.model.MotherBoard;
import com.torry.model.Ram;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        HardDisk seagate = factory.getBean(HardDisk.class);
        seagate.display();

        Ram pro = factory.getBean(Ram.class);
        pro.display();

        MotherBoard mb = factory.getBean(MotherBoard.class);
        mb.display();
    }
}
