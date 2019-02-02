package com.company;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("123-123-1234");
    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        int choice;
        printAction();

        while(!quit){

            System.out.println("Please enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    System.out.println("Switching off the phone.");
                    quit = true;
                    break;

                case 1:
                    mobilePhone.printContacts();
                    break;

                case 2:
                    addNewContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;

                case 5:
                    queryContact();
                    break;

                case 6:
                    printAction();
                    break;
            }

        }

    }
    private static void startPhone(){
        System.out.println("Starting phone.");
    }

    public static void printAction(){
        System.out.println("\nAvailable actions: \npress");
        System.out.println( "0 - Power off.\n" +
                            "1 - Display all contacts.\n" +
                            "2 - Add Contact.\n" +
                            "3 - Update Contact.\n" +
                            "4 - Delete Contact.\n" +
                            "5 - Search Contact\n" +
                            "6 - Display the menu again.\n" );

        System.out.println(" Please choose you action.");

    }

    public static void addNewContact(){
        System.out.println("Please enter the name: ");

        String contactName =  scanner.nextLine();
        System.out.println("Please the number: ");
        String contactNumber = scanner.nextLine();
        Contacts newContactInfo = Contacts.createContacts(contactName, contactNumber);

        if(mobilePhone.addNewContact(newContactInfo)){
            System.out.println("New contact added successfully. \n " +
                    "Name: " +  contactName +
                    "\nContact: " + contactNumber);
        } else {
            System.out.println("Could not add " + contactName + ". Record already on file.");
        }
    }


    public static void updateContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContacts(name);

        if(existingContactRecord == null){
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact number: ");
        String newNumber = scanner.nextLine();

        Contacts updatedContactInfo = Contacts.createContacts(newName, newNumber);

        if(mobilePhone.updateContact(existingContactRecord, updatedContactInfo)){
            System.out.println("Contact updated successfully.");
        }else {
            System.out.println("Error updating the record.");
        }
    }

    public static void removeContact(){
        System.out.println("Enter the contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContacts(name);

        if(existingContactRecord == null){
            System.out.println("Contact not found.");
            return;
        }

        if(mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Contact deleted successfully");
        } else{
            System.out.println("Error deleting the contact.");
        }

    }


    public static void queryContact(){
        System.out.println("Enter the contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContacts(name);

        if(existingContactRecord == null){
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Name: " + existingContactRecord.getName() + "\n"
                         + "Number: " + existingContactRecord.getNumber());
    }

}

