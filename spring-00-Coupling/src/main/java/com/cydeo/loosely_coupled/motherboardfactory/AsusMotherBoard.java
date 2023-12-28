package com.cydeo.loosely_coupled.motherboardfactory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AsusMotherBoard extends MotherBoard{
    public AsusMotherBoard(String model, String manufacture, int ramSlots, int carSlots, String bios) {
        super(model, manufacture, ramSlots, carSlots, bios);
    }

    @Override
    public void loadProgram(String programName) {
        System.out.println("Program "+ programName+" is now loading" );
    }
}
