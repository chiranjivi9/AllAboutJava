package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner =  new Scanner(System.in);

    public static void main(String[] args) {
        int count;
        System.out.println("Please enter the length of the array.");
        count = scanner.nextInt();  // Take the array length from the user
        int[] array = getArrayElements(count); // create an array with the length the user entered.

        printArray(array);

        System.out.println("The minimum value from the array is :" + findMin(array));

    }


//  Method to print the array.
    public static void printArray(int[] array){
        for(int i = 0; i<array.length; i++){
            System.out.println("Element at position " + i + " is " + array[i]);

        }
    }

//  Method to add elements to the array.
    public static int[] getArrayElements(int element){
        System.out.println("Enter " + element + " elements to the array");

//        declaring an array
        int[] value = new int[element];

//        adding elements to the array.
        for(int i = 0 ; i < value.length; i++){
//            taking user input from the user with scanner.nextInt()
            value[i] = scanner.nextInt();
        }

        return value;

    }

//  Method to find minimum value from the array
    public static int findMin(int[] array){
        int[] newArray = new int[array.length];
        int temp = 0;

        for(int i = 0; i < array.length; i++){
            newArray[i] = array[i];

        }

        boolean flag = true;

        while(flag){
            flag = false;

            for(int j = 0; j < newArray.length-1; j++){
                if(newArray[j] < newArray[j+1]){

                    temp = newArray[j+1];
                    newArray[j+1] = newArray[j];
                    newArray[j] = temp;
                    flag = true;
                }
            }
        }
        return newArray[newArray.length-1];
    }
}
