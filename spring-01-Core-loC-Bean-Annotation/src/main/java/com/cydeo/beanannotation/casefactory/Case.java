package com.cydeo.beanannotation.casefactory;

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
