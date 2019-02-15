package com.company;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

// Basically abstract methods in an abstract class are declared to make sure that we have those methods for sure in the extended class.
    // THEY NEED TO BE OVERRIDDEN IN THE CHILD CLASS.
    // THe child class should have the abstract methods. The declaration matters and not what is contained in the method.
    // Here we are only declaring the methods and they don't have a definition.
    public  abstract void eat();
    public abstract  void breathe();


    public String getName(){
        return name;
    }







}
