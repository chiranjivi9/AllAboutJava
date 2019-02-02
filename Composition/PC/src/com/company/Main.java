package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimension dimension = new Dimension(20,20,10);
        Case theCase = new Case("ABC1000", "Dell", "240", dimension);

        Resolution resolution = new Resolution(1080, 1080);
        Monitor monitor = new Monitor("Beast 700", "Acer", 27, resolution);
//                                  OR you can create a resolution object as below
//        Monitor monitor1 = new Monitor("Rocker Disp 7000", "Acer", 27, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("BJ-200", "Intel", 2, 3, "V2.44");


         PC thePC = new PC(motherboard, theCase, monitor);

         thePC.powerUp();

    }
}
