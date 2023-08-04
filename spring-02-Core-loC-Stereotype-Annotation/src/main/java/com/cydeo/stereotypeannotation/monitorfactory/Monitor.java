package com.cydeo.stereotypeannotation.monitorfactory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Monitor {
    private String model;
    private String manufacture;
    private int size;

    public Monitor(String model, String manufacture, int size) {
        this.model = model;
        this.manufacture = manufacture;
        this.size = size;
    }

    public abstract void drawPixelAt();
}
