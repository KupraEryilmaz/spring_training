package com.cydeo.stereotype_annotation.casefactory;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
@Getter
public abstract class Case {
    private String model;
    private String manufacture;
    private String powerSupply;
    @Autowired
    private Dimensions dimensions;

    public Case(String model, String manufacture, String powerSupply) {
        this.model = model;
        this.manufacture = manufacture;
        this.powerSupply = powerSupply;
    }
    public abstract void pressPowerButton();
}
