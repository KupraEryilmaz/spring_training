package com.cydeo.loosely_coupled.monitorfactory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AcerMonitor extends Monitor{
    public AcerMonitor(String model, String manufacture, int size) {
        super(model, manufacture, size);
    }

    @Override
    public void drawPixelAt() {
        System.out.println("Drawing pixel with Acer");
    }
}
