package com.cydeo.monitorfactory;

public class SonyMonitor extends Monitor{
    public SonyMonitor(String model, String manufacture, int size) {
        super(model, manufacture, size);
    }

    @Override
    public void drawPixelAt() {
        System.out.println("Driving pixel with Sony");
    }
}
