package com.company;

public class Main {

    public static void main(String[] args) {


        Dog dog = new Dog("Bruno");
        dog.breathe();
        dog.eat();

        System.out.println("");
        Parrot parrot = new Parrot("parrot");
        parrot.breathe();
        parrot.eat();
        parrot.Canfly();

        System.out.println("");
        Penguin pingu = new Penguin("Pingu");
        pingu.breathe();
        pingu.eat();
        pingu.Canfly();

    }
}
