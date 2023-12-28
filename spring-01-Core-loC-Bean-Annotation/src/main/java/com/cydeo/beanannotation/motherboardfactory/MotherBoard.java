package com.cydeo.beanannotation.motherboardfactory;

public abstract class MotherBoard {
    private String model;
    private String manufacture;
    private int ramSlots;
    private int carSlots;
    private String bios;

    public MotherBoard(String model, String manufacture, int ramSlots, int carSlots, String bios) {
        this.model = model;
        this.manufacture = manufacture;
        this.ramSlots = ramSlots;
        this.carSlots = carSlots;
        this.bios = bios;
    }
    public abstract void loadProgram(String programName);
}
