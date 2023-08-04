package com.cydeo.stereotypeannotation.monitorfactory;

import org.springframework.stereotype.Component;

@Component
public class AcerMonitor extends Monitor{
    public AcerMonitor() {
        super("43 inch beast","Acer",43);
    }

    @Override
    public void drawPixelAt() {
        System.out.println("Driving pixel with Acer");
    }
}
