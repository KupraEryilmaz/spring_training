package com.cydeo.tightly_coupled;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AsusMotherBoard {

    private String model;
    private String manufacture;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading...");
    }

}
