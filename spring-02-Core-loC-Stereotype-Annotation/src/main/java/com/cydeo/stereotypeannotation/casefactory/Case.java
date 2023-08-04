package com.cydeo.stereotypeannotation.casefactory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Case {
    private String model;
    private String manufacture;
    private String powerSupply;

    public Case(String model, String manufacture, String powerSupply) {
        this.model = model;
        this.manufacture = manufacture;
        this.powerSupply = powerSupply;
    }
    public abstract void pressPowerButton();
}
