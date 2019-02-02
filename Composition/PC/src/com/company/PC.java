package com.company;

public class PC {
    private Motherboard motherboard;
    private Case theCase;
    private Monitor monitor;

    public PC(Motherboard motherboard, Case theCase, Monitor monitor) {
        this.motherboard = motherboard;
        this.theCase = theCase;
        this.monitor = monitor;
    }

    public void powerUp(){

        theCase.pressPowerButton();
        drawLogo();

    }

    public void drawLogo(){

        monitor.drawPixelAt(20, 21, "White");
    }

}
