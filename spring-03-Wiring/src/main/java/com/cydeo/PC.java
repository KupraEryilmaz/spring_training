package com.cydeo;

import com.cydeo.casefactory.Case;
import com.cydeo.monitorfactory.Monitor;
import com.cydeo.motherboardfactory.MotherBoard;
import lombok.Getter;

@Getter
public class PC {

    private Case theCase;
    private Monitor monitor;
    private MotherBoard mother;

    public PC(Case theCase, Monitor monitor, MotherBoard mother) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.mother = mother;
    }
    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        monitor.drawPixelAt();
    }
}
