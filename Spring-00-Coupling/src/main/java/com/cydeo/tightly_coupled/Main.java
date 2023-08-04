package com.cydeo.tightly_coupled;

public class Main {
    public static void main(String[] args) {


    AcerMonitor theMonitor = new AcerMonitor("27inch Beast", "Acer", 27);
    DellCase theCase = new DellCase("220B", "Dell", "240");
    AsusMotherBoard theMotherboard = new AsusMotherBoard("BJ-200", "Asus", 4, 6, "v2.44");

    PC myPc = new PC(theCase,theMotherboard,theMonitor);
    myPc.powerUp();

    }
}
