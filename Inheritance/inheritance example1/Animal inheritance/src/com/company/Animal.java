package com.company;

public class Animal {

//  color, legs, weight,

    private String color;
    private int legs;
    private int weight;

//    Creating constructors;
    public Animal(String color, int legs, int weight){
        this.color = color;
        this.legs = legs;
        this.weight = weight;
        System.out.println(" Animal constructor called.");

    }


    // method

    public void eat(){
        System.out.println("Animal.eat() called.");
    }

    public void move(){
        System.out.println("Animals move.");
    }

    //    overridden method


    // creating getters and setters

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getLegs(){
        return legs;
    }

    public void setLegs(int legs){
        this.legs = legs;
    }


    public int getWeight(){
        return weight;
    }

    public void setWeight(){
        this.weight = weight;
    }

}
