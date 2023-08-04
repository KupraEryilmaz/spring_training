package com.cydeo.casefactory;

public class DellCase extends Case{
    public DellCase(String model, String manufacture, String powerSupply, Dimension dimension) {
        super(model, manufacture, powerSupply, dimension);
    }

    @Override
    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }
}
