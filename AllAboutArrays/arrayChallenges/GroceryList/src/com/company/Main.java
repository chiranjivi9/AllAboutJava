package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList(); // Creating a class of type GroceryList.

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructionMenu();

        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // to clear the input buffer;

            switch (choice){

                case 0:
                    printInstructionMenu();
                    break;

                case 1:
                    groceryList.printGroceryList();
                    break;

                case 2:
                    addItem();
                    break;

                case 3:
                    modifyList();
                    break;

                case 4:
                    searchFromList();
                    break;

                case 5:
                    removeFromList();
                    break;

                case 6:
                    makeACopy();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructionMenu(){
        System.out.println("\n Press ");
        System.out.println("\t 0 - To print the choice option.");
        System.out.println("\t 1 - To print the list of grocery items. ");
        System.out.println("\t 2 - To add an item in the grocery list.");
        System.out.println("\t 3 - To modify an item in the grocery list.");
        System.out.println("\t 4 - To search for an item in the grocery list.");
        System.out.println("\t 5 - To remove an item from the grocery list.");
        System.out.println("\t 6 - Make a copy of the grocery list.");
        System.out.println("\t 7 - To quit the application.");

    }

    public static void addItem(){
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());

    }

    public static void modifyList(){
        System.out.println("Enter item name to be replaced : ");
        String currentItem = scanner.nextLine();

//        scanner.nextLine();
//        scanner.nextLine(); // to clear the input buffer.
        System.out.println("Enter the replacement item :");
        String newItem = scanner.nextLine();
        groceryList.modifyItem(currentItem, newItem);

    }

    public static void searchFromList(){
        System.out.println("Enter the item to be searched: ");
        String searchItem = scanner.nextLine();
        if(groceryList.searchForItem(searchItem)){
            System.out.println("Found " + searchItem + " in the list.");

        } else {
            System.out.println("Item " + searchItem + " not found.");

        }
    }

    public static void removeFromList(){
        System.out.println("Enter the item number to be removed : ");
        String itemToRemove = scanner.nextLine();
        groceryList.removeItem(itemToRemove);
    }

    public static void makeACopy(){
//        make a copy of the grocery list and store in another arrayList
        ArrayList<String> myGroceryList = new ArrayList<String>();
        myGroceryList.addAll(groceryList.getGroceryList());  // makes a copy of array and stores in the new array
        System.out.println("Original list : " + groceryList.getGroceryList());
        System.out.println("Copy of List : " + myGroceryList);



    }
}
