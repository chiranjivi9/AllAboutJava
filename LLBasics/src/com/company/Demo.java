// The following code shows how to implements the following:
        //Declare a LinkedList
        //Use of Iterators
        //Use of ListIterators and the inbuilt functions related to it.
        //How to use the compareTo Operator.

package com.company;

import java.util.*;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String>  myLL = new LinkedList<String>();

//        System.out.println(myLL);

        myLL.add("Pune");
        myLL.add("Mumbai");
        myLL.add("Delhi");
        myLL.add("Nagpur");
        myLL.add("Kochin");
        myLL.add("Hyderabad");
        myLL.add("Nasik");


//        Code to test the addInOrder method
//        printList(myLL);
//
//        myLL.remove(4);
//        System.out.println("removed index 4");
//
//        printList(myLL);
//
//        System.out.println("added new city to index 2");
//        myLL.add(2,"Jodhpur");
//
//        printList(myLL);
//
//        addInOrder(myLL, "Osmanabad");
//        printList(myLL);
//
//        addInOrder(myLL, "Pune");
//        addInOrder(myLL, "Arizona");
//        printList(myLL);
//
// Test for addInOrder Ends here
        System.out.println(myLL);
        vist(myLL);


    }


    private static void printList(LinkedList<String> linkedList){

       Iterator<String> i = linkedList.iterator();

       while(i.hasNext()){
           System.out.println(" Visiting " + i.next());
       }

        System.out.println("==================================");

    }

    // Method to arrange the cities in alphabetical order.
    // Using the concept of ListIterator ->
    // It allows to go to the next or the previous index with "listIterator.previous();"


    private static boolean addInOrder(LinkedList<String> linkedList, String nextCity){
        ListIterator<String> stringListIterator = linkedList.listIterator(); // ListIterator declaration

        while(stringListIterator.hasNext()){
            // compareTo Operator used to compare values in a linkedList
            int comparison = stringListIterator.next().compareTo(nextCity);
            if(comparison == 0){
                // city already exists. Do Not Add
                System.out.println(nextCity + " is already in the list.");
                return false;
            } else if(comparison > 0 ){
                //The new city appears before the existing city alphabetically.
                stringListIterator.previous(); // point index to the previous position.
                stringListIterator.add(nextCity);
                System.out.println("City added!");
                return true;
            } else if(comparison < 0){
                // City appears after the last city in the list.
                // New city appears after the current city alphabetically.
            }

        }

        stringListIterator.add(nextCity);
        return true;
    }

//    Adding a menu driven method to iterate over the cities

    private static void vist(LinkedList cities){
//        adding a Scanner to get the city name input from the user
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;

        // Adding a ListIterator to iterate to the prev and next indexes of the List;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){
            // Check for empty list
            System.out.println("List is empty");
            return;
        } else {
                System.out.println("Now visiting : " + listIterator.next());
                printMenu();
            }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){

                case 1:

                    System.out.println("Vacation Over!");
                    quit = true;
                    break;

                case 2:
                    // Adding additional check
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now visiting : " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of List.");
                        goingForward = false;
                    }
                    break;

                case 3:
                    //Additional check
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Visiting the previous city : " + listIterator.previous());
                    } else {
                        System.out.println("Reached the start of the list.");
                        goingForward = true;
                    }
            }

        }

    }

    private static void printMenu(){
        System.out.println("1 - Quit. " + "\n" +
                         "2 - Go to the next city." + "\n" +
                         "3 - Go to the previous city.");

    }
}
