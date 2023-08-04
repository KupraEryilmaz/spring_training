package com.cydeo;

import com.cydeo.casefactory.Case;
import com.cydeo.config.PcConfig;
import com.cydeo.monitorfactory.Monitor;
import com.cydeo.motherboardfactory.MotherBoard;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(PcConfig.class);

        Case dell = container.getBean(Case.class);
        Monitor sony = container.getBean(Monitor.class);
        MotherBoard asus= container.getBean(MotherBoard.class);

        PC myPc = new PC(dell,sony,asus);
        myPc.powerUp();

    }
}
