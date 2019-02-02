package com.company;

public class Human extends Animal {


    public Human(String color, int legs, int weight) {
        super(color, legs, weight);
    }


    private void chew(){
        System.out.println("Human.chew() called.");

    }

    @Override
    public void eat() {

        System.out.println("Human.eat() called.");
        System.out.println("This is method overriding. This is run time polymorphism.");
        chew();
        System.out.println("super.eat() called below. The super keyword calls the method from the Parent class.");
        super.eat();

    }
}
