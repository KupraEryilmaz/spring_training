package com.cydeo.loosely_coupled.casefactory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DellCase extends Case{

    public DellCase(String model, String manufacture, String powerSupply) {
        super(model, manufacture, powerSupply);
    }

    @Override
    public void pressPowerButton() {
        System.out.println("Power button pressed");

    }
}
