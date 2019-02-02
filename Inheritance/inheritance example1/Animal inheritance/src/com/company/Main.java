package com.company;

public class Main {

    public static void main(String[] args) {
//        Learning inheritance


//        Creating animal object of type Animal
        Animal animal = new Animal("black", 4, 140);

        System.out.println("");

//        Creating human object of type Animal - method overriding
        Animal human = new Human("Dont know", 2, 170);

        System.out.println("");

//        Creating human object of type human
        Human humanOne = new Human("Dont care", 2, 160);


//
        System.out.println("Calling methods.");

        animal.eat();
        System.out.println("");
        human.eat();

    }
}
