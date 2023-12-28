package com.cydeo.loosely_coupled;

import com.cydeo.loosely_coupled.casefactory.Case;
import com.cydeo.loosely_coupled.monitorfactory.Monitor;
import com.cydeo.loosely_coupled.motherboardfactory.MotherBoard;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PC {

    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        monitor.drawPixelAt();
    }
}
