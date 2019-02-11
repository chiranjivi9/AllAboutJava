package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String[] myStr = new String[10];
        int[] Arr = new int[10];

        ArrayList<Integer> myArrList = new ArrayList<>();
//        myArrList.add("Bob");


        System.out.println(myArrList);

//        myArrList.add("Stan Lee");

        System.out.println(myArrList);

        System.out.println(Arr);

//        adding to the array list
        for(int i = 0; i<=10; i++){
            myArrList.add(Integer.valueOf(i));
        }

        for(int i = 0; i< myArrList.size(); i++){
            System.out.println("This is iteration: " + i );
            System.out.println("The elements of Array List are : " + i);
        }

        System.out.println(myArrList);

        Integer myNewInt = Integer.valueOf(89);

        int anotherInt = myNewInt; // myNewInt.intValue();
        System.out.println(anotherInt);


    }
}
