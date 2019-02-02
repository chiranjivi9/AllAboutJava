
// Learning Composition
//Composition
// HAS-A relation
//eg:  A bedroom has a Wall, Ceiling, Bed, Lamp and so on..

package com.company;

public class Main {

    public static void main(String[] args) {

//        Creating objects.
        Wall wall1 = new Wall("East");
        Wall wall2 = new Wall("West");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Lamp lamp = new Lamp("Table Lamp", false);

        Bed bed = new Bed("Queen size", 75, 2, 3);

        Ceiling ceiling = new Ceiling(200,"White");

        Bedroom bedroom = new Bedroom("Bob's Bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp );

        bedroom.makeBed();
        bedroom.getLamp().turnOn();

    }
}
