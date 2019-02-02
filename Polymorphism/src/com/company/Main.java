package com.company;

class Car {
    private boolean hasEngine;
    private int cylinder;
    private String name;
    private int wheels;


    public Car(int cylinder, String name){
        this.hasEngine = true;
        this.cylinder = cylinder;
        this.name = name;
        this.wheels = 4;

    }

    public String startEngine(){
        return "Car1 -> Engine Starts";

    }

    public String accelerate(){
        return  "Car1 -> Accelerated";

    }

    public String brake(){
        return "Car1 -> Stopped";

    }

    public int getCylinder() {
        return cylinder;
    }

    public String getName() {
        return name;
    }
}


class Tesla extends Car {
    public Tesla(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return "Tesla -> Engine Starts";
    }

    @Override
    public String accelerate() {
        return "Tesla -> Accelerated";
    }

    @Override
    public String brake() {
        return "Tesla -> Stopped";
    }
}

class Outlander extends Car {
    public Outlander(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine(){
        return "Outlander -> Engine Starts";
    }

    @Override
    public String accelerate() {
        return "Outlander -> Accelerated";
    }

    @Override
    public String brake() {
        return "Outlander -> Stopped";
    }
}

class Ford extends Car {

    public Ford(int cylinder, String name) {
        super(cylinder, name);
      }

    @Override
    public String startEngine() {
        return "Ford -> Engine Starts";
    }

//    @Override
//    public String accelerate() {
//        return "Ford -> Accelerate";
//    }

    @Override
    public String brake() {
        return "Ford -> Stopped";
    }
}



public class Main {

    public static void main(String[] args) {
        Car car1 = new Car(8, "Base Car.");
        System.out.println(car1.startEngine());
        System.out.println(car1.accelerate());
        System.out.println(car1.brake());
        System.out.println("");

        Tesla t1 = new Tesla(12, "Tesla");
        System.out.println(t1.startEngine());
        System.out.println(t1.accelerate());
        System.out.println(t1.brake());
        System.out.println();
        Ford ford = new Ford(8, "Ford");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
    }
}
