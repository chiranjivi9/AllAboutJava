package com.company;

import java.util.ArrayList;

public class GroceryList {

//    private int[] arrayNumber = new int[4];
    private ArrayList<String> groceryList = new ArrayList<>();

//    Add Item, Get Item, Modify Item, Remove Item

//    Method to add item in the list
    public void addGroceryItem(String item){
        groceryList.add(item);
    }

//    Method to print the item in the List
    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your list.");
        for(int i = 0; i< groceryList.size(); i++){
            System.out.println((i+1)+"." + groceryList.get(i));

        }
    }



//    Method to modify the grocery list.
    public void modifyItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position >= 0){
            modifyGroceryList(position, newItem);
        }
    }

    private void modifyGroceryList(int position, String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");

    }

//    Method to remove item from the grocery list.
    public void removeItem(String removeItem){
        int position = findItem(removeItem);
        if(position >= 0){
            removeGroceryItem(position);

        }
    }

    private void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("Item " + theItem + " removed successfully!");

    }


    private int findItem(String searchItem){
            return groceryList.indexOf(searchItem);

    }

    public boolean searchForItem(String item){
        int position = findItem(item);
        if(position >= 0){
            return true;

        }
        return false;
    }


    public ArrayList<String> getGroceryList(){
        return groceryList;
    }

}




