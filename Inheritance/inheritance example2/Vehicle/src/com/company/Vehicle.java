package com.company;

public class Vehicle {

    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;


    public Vehicle(String name, String size, int currentVelocity, int currentDirection){
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }


    public void steer(int currentDirection){
        this.currentDirection += currentDirection;

        System.out.println("Vehicle.steer() called. Vehicle steering at " + currentDirection + " degrees");
    }

    public void move(int currentVelocity, int currentDirection){
        this.currentVelocity = currentVelocity;
        this.currentDirection = currentDirection;

        System.out.println("Vehicle.move() called.  Moving at : " + currentVelocity + " and in direction " + currentDirection + " degrees");
    }

    public void stop(){

        this.currentDirection = 0;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }


}
