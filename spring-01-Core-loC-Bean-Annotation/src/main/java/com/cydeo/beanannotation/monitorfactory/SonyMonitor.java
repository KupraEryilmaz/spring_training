package com.cydeo.beanannotation.monitorfactory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SonyMonitor extends Monitor {
    public SonyMonitor(String model, String manufacture, int size) {
        super(model, manufacture, size);
    }

    @Override
    public void drawPixelAt() {
        System.out.println("Draw pixel with Sony");
    }
}
