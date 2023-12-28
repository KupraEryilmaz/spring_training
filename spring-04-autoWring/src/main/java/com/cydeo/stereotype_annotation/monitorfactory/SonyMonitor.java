package com.cydeo.stereotype_annotation.monitorfactory;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Component
public class SonyMonitor extends Monitor{
    public SonyMonitor() {
        super("25 inch beast","Sony",25);
    }

    public void drawPixelAt() {
        System.out.println("Drawing pixel with Sony");
    }
}
