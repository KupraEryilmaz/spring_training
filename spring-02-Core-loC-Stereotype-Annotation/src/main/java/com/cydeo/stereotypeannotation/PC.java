package com.cydeo.stereotypeannotation;

import com.cydeo.stereotypeannotation.casefactory.Case;
import com.cydeo.stereotypeannotation.monitorfactory.Monitor;
import com.cydeo.stereotypeannotation.motherboardfactory.MotherBoard;
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
        monitor.drawPixelAt();
    }
}
