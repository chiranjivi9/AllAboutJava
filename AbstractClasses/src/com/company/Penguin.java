package com.company;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }


    @Override
    public void Canfly() {
        super.Canfly();
        System.out.println(" I prefer swimming. You see I am scared of heights..");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating. Oh btw I would like more fish fingers.");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat.");
    }



}
