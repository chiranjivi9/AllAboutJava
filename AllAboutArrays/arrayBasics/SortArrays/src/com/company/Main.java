package com.company;

import java.util.Scanner;

public class Main {


    private static Scanner scanner = new Scanner(System.in); // allows to take input from user.

    public static void main(String[] args) {
        int[] myArray = getArray(5);

        for(int i = 0; i < myArray.length; i++){
            System.out.println("Element " + (i+1) + " has value " + myArray[i]);

        }
        System.out.println("");

        int [] sortedArray = sortArrayValues(myArray);
        printArray(sortedArray);

    }

//Method to print array
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + (i+1) + " has value " + array[i]);

        }
    }



// Method to add values to the array.
    public static int[] getArray(int number){

        System.out.println("Enter " + number + " in the array.\r");
        int[] values = new int[number];
        for(int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();

        }

        return values;
    }

// Method to sort array in descending order
    public static int[] sortArrayValues(int[] element){

        int[] newSortedArray = new int[element.length];

        for(int i = 0; i < element.length; i++){
            newSortedArray[i] = element[i];

        }

        boolean flag = true;
        int temp;

        while(flag){
            flag = false;
            for(int i = 0; i < newSortedArray.length-1; i++){
                if(newSortedArray[i] < newSortedArray[i+1]){

                    temp = newSortedArray[i];
                    newSortedArray[i] = newSortedArray[i+1];
                    newSortedArray[i+1] = temp;
                    flag = true;

                }
            }
        }
        return newSortedArray;
    }

}
