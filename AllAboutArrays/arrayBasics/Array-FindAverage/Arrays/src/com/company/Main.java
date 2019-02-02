package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in); // Take input from the user.

    public static void main(String[] args) {
        int[] intArray = getInput(5);

        //Print the array values
        for(int i = 0; i < intArray.length; i++){
            System.out.println("Elemet #" + i + " has value " + intArray[i]);

        }

        System.out.println("Average is : " + average(intArray));
    }


// Method to take in values from the user
    public static int[] getInput(int number){

        System.out.println("Enter "+ number + " values in the array ");

//    adding the values to the array
        int[] values = new int[number];
        for(int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();

        }

        return values;
    }


//    Method to calculate the average of the array elements
    public static double average(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }

        return (double) sum / (double)array.length;

    }

}
