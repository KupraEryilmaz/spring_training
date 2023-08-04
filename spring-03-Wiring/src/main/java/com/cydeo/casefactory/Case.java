package com.cydeo.casefactory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Case {
    private String model;
    private String manufacture;
    private String powerSupply;
    private Dimension dimension;

    public Case(String model, String manufacture, String powerSupply, Dimension dimension) {
        this.model = model;
        this.manufacture = manufacture;
        this.powerSupply = powerSupply;
        this.dimension = dimension;
    }

    public abstract void pressPowerButton();
}
