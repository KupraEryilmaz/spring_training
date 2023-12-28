package com.cydeo.stereotype_annotation;

import com.cydeo.stereotype_annotation.config.PcConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(PcConfig.class);

        PC myPc = context.getBean(PC.class);
        System.out.println(myPc.getTheCase().getDimensions().getDepth());

    }
}
