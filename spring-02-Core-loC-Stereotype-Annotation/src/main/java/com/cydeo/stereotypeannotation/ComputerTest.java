package com.cydeo.stereotypeannotation;

import com.cydeo.stereotypeannotation.casefactory.Case;
import com.cydeo.stereotypeannotation.config.PcConfig;
import com.cydeo.stereotypeannotation.monitorfactory.Monitor;
import com.cydeo.stereotypeannotation.motherboardfactory.MotherBoard;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(PcConfig.class);


        System.out.println("************Retrieving the beans with default class name******************");

        Monitor sony = container.getBean("acerMonitor",Monitor.class);
        Case dell =container.getBean(Case.class);
        MotherBoard asus = container.getBean(MotherBoard.class);

        PC myPc= new PC(dell,sony,asus);
        myPc.powerUp();
        asus.loadProgram("Exel");
        System.out.println("************Retrieving the beans with primary class name******************");

        Monitor sony2 = container.getBean(Monitor.class);
        Case dell2 =container.getBean(Case.class);
        MotherBoard asus2 = container.getBean(MotherBoard.class);

        PC myPc2= new PC(dell2,sony2,asus2);
        myPc2.powerUp();
        asus2.loadProgram("Exel");



    }
}
