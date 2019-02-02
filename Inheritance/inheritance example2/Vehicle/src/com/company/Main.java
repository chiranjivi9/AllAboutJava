package com.company;

public class Main {

    public static void main(String[] args) {


        Tesla modelS = new Tesla(72);

        modelS.accelerate(20);
        System.out.println("");
        modelS.accelerate(30);
        System.out.println("");
//        modelS.changeVelocity(20,45);
        modelS.accelerate(-50);
        modelS.changeVelocity(12, 20);




    }
}
