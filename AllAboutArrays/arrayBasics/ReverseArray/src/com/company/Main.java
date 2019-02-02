package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here

        int count;
        System.out.println("Enter the length of the array: ");

        count = scanner.nextInt();
        int[] myArray = addElement(count);

        printArray(myArray);
        System.out.println(" Reverse array is");
        printArray(reverse(myArray));
    }

    public static int[] addElement(int element){

        System.out.println("Enter " + element + " elements to the array");

        int[] values = new int[element];

        for(int i = 0; i < values.length; i++){

            values[i] = scanner.nextInt();
        }
        return values;
    }


    public static void printArray(int[] array){

        for(int i = 0; i < array.length; i++){

            System.out.println("Element at " + i + " is " + array[i]);

        }
    }


    public static int[] reverse(int[] array){

//        int[] reversedArray = new int[array.length];
//[1,2,3]
        int maxIndex = array.length-1;
        int halfIndex = array.length / 2;

        for(int i = 0; i < halfIndex; i++){

            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;

        }
        return array;
    }
}
