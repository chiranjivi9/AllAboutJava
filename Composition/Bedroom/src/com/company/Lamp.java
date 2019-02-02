package com.company;

public class Lamp {

    private String style;
    private boolean isRunOnBattery;


    public Lamp(String style, boolean isRunOnBattery){
        this.style =  style;
        this.isRunOnBattery = isRunOnBattery;
    }

    public void turnOn(){
        System.out.println("Lamp -> Lamp turned on");
    }

    public String getStyle(){
        return style;
    }

    public boolean isRunOnBattery() {
        return isRunOnBattery;
    }
}
