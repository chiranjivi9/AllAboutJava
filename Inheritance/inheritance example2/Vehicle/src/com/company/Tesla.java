package com.company;

public class Tesla extends Car{

    private int numberOfRoadServiceMonths;

    public Tesla(int numberOfRoadServiceMonths) {
        super("Tesla Model S", "Rear wheel drive", 1, 1, 5, 4, 6, true, 1);
        this.numberOfRoadServiceMonths = numberOfRoadServiceMonths;
    }

    public void accelerate(int rate){

        int newVelocity = getCurrentVelocity() + rate;

        if(newVelocity == 0){
            stop();
            changeGear(1);
        } else if(newVelocity <= 10){
            changeGear(1);
        } else if( newVelocity >= 10 && newVelocity <= 20){
            changeGear(2);
        } else if( newVelocity >= 21 && newVelocity <= 30){
            changeGear(3);
        } else if( newVelocity >= 31 && newVelocity <= 40){
            changeGear(4);
        } else if( newVelocity >= 41 ){
            changeGear(5);
        }

        if (newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }

    }
}
