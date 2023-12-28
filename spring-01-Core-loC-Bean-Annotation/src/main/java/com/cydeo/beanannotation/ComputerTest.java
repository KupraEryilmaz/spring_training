package com.cydeo.beanannotation;

import com.cydeo.beanannotation.casefactory.Case;
import com.cydeo.beanannotation.casefactory.DellCase;
import com.cydeo.beanannotation.config.ComputerConfig;
import com.cydeo.beanannotation.config.RandomConfig;
import com.cydeo.beanannotation.monitorfactory.Monitor;
import com.cydeo.beanannotation.monitorfactory.SonyMonitor;
import com.cydeo.beanannotation.motherboardfactory.AsusMotherBoard;
import com.cydeo.beanannotation.motherboardfactory.MotherBoard;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {
    public static void main(String[] args) {

        System.out.println("Creating Container");

        //Creating container by using Application Context
        ApplicationContext container = new AnnotationConfigApplicationContext(ComputerConfig.class, RandomConfig.class);


        System.out.println("************Retrieving the beans with bean name******************");

        SonyMonitor sony= container.getBean("sony2",SonyMonitor.class);
        DellCase dell=container.getBean(DellCase.class);
        AsusMotherBoard asus= container.getBean(AsusMotherBoard.class);

        PC myPc = new PC(dell,sony,asus);

        myPc.powerUp();
        dell.pressPowerButton();
        asus.loadProgram("Exel");

        System.out.println("************Retrieving the beans with default method name******************");
        Monitor sony2 = container.getBean("MonitorSony",Monitor.class);
        Case dell2 = container.getBean(Case.class);
        MotherBoard asus2 = container.getBean(MotherBoard.class);

        PC myPc2 = new PC(dell2,sony2,asus2);
        myPc2.powerUp();

        System.out.println("************Retrieving the beans with @Primary******************");
        Monitor sony3 = container.getBean(Monitor.class);
        Case dell3 = container.getBean(Case.class);
        MotherBoard asus3 = container.getBean(MotherBoard.class);

        PC myPc3 = new PC(dell3,sony3,asus3);
        myPc3.powerUp();

    }
}
