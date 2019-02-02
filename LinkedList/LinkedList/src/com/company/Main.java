package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> arL = new ArrayList<String>();
        System.out.println(arL.size());
        arL.add("def");
        arL.remove(3);
        arL.get(0);

        LinkedList<String> myLinkedList = new LinkedList<String>();

        myLinkedList.add("Sydney");
        myLinkedList.add("Melbourne");
        myLinkedList.add("Perth");
        myLinkedList.add("Brisbane");
        myLinkedList.add("Canberra");

        printList(myLinkedList);

        myLinkedList.add(2,"Darwin");
        System.out.println("Added new entry at index 2.");
        printList(myLinkedList);

        System.out.println("Removing city from index 3 i.e Perth");
        myLinkedList.remove(3);

        printList(myLinkedList);

    }

    public static void printList(LinkedList<String> linkedList){

        Iterator<String> i = linkedList.iterator();

        while(i.hasNext()){

            System.out.println("City in Linked List is : " + i.next());

        }
    }
}
