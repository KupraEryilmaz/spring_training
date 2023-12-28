package com.cydeo.beanannotation;

import com.cydeo.beanannotation.casefactory.Case;
import com.cydeo.beanannotation.monitorfactory.Monitor;
import com.cydeo.beanannotation.motherboardfactory.MotherBoard;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
        // Fancy graphics
        monitor.drawPixelAt();
    }
}
