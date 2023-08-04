package com.cydeo.tightly_coupled;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PC {

    private DellCase theCase;
    private AsusMotherBoard mother;
    private AcerMonitor monitor;

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        monitor.drawPixelAt(1200, 50, "yellow");
    }
}
