package com.company;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

//
        LinkedList<String> wordList = new LinkedList<String>();
        System.out.println("Linked List elements " + wordList);

//        wordList.add("apple");
//        wordList.add("application");
//        wordList.add("contour");
//        wordList.add("Walking");
//
//        wordList.add("king");
//        wordList.add("linkedlist");
//        wordList.add("Banana");

        System.out.println("The original LinkedList is : " + wordList);
        addInOrder(wordList, "apple");
        addInOrder(wordList, "bazinga");
        addInOrder(wordList, "mouse");
        addInOrder(wordList, "beats");
        addInOrder(wordList, "Apple");
        addInOrder(wordList, "banana");
        System.out.println(wordList);

        addInOrder(wordList, "mouse");

        System.out.println(wordList);

    }


    public static boolean addInOrder(LinkedList<String> linkedList, String newWord){

       ListIterator<String> listIterator =  linkedList.listIterator();


       while(listIterator.hasNext()){

           int comparison = listIterator.next().compareTo(newWord);

           if(comparison == 0){
                // word entrered is already in the list
               System.out.println("Word " + newWord + " is already in the List.");
               return false;

           } else if( comparison > 0){
            // word passed appears before the current word (Alphabetically)
               listIterator.previous();
               listIterator.add(newWord);
               return true;
           } else if( comparison > 0){
               // word appears later in alphabetic order
           }

       }

       listIterator.add(newWord);
        return true;
    }
}
