package com.company;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contacts> myContacts;

    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contacts>();

    }

// ADD NEW CONTACT
    public boolean addNewContact(Contacts contact){
        if(findContacts(contact.getName()) >= 0){
            System.out.println("Contact " + contact + " already in the database.");
            return false;
        } else {
            myContacts.add(contact);
            return true;
        }
    }


// UPDATE CONTACT
    public boolean updateContact(Contacts oldContact, Contacts newContact){
        int foundPosition = findContacts(oldContact);
        if(foundPosition < 0){
            System.out.println(oldContact + " not found in the directory.");
            return false;
        } else if (findContacts(newContact.getName()) != -1) {
            System.out.println("Contact name " + newContact.getName() + " already exists. Update failed.");
            return false;
        }
//        update the value
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " successfully updated with " + newContact.getName());
        return true;
    }


// REMOVE CONTACT
    public boolean removeContact(Contacts contactToDelete){

        int foundPosition = findContacts(contactToDelete);

        if(foundPosition < 0){
            System.out.println(contactToDelete.getName() + ", does not exist in the record.");
            return false;
        } else {
            myContacts.remove(foundPosition);
//            System.out.println(contactToDelete.getName() + ", deleted successfully!");
            return true;
        }

    }


// FIND CONTACTS
    public int findContacts(Contacts findContact){
        return myContacts.indexOf(findContact);
    }


// findContact() overloaded.
    public int findContacts(String findByName){
        // iterate through the ArrayList and create a new object of type Contact
        for(int i = 0; i < this.myContacts.size(); i++){
            Contacts contact = this.myContacts.get(i);
            if(contact.getName().equals(findByName)){
                return i;
            }
        }
        return -1;
    }

// QUERY CONTACTS

    public String queryContacts(Contacts contact){

        if(findContacts(contact) >= 0){
            return contact.getNumber();
        }

        return null;
    }

    public Contacts queryContacts(String name){
        int position = findContacts(name);
        if(position >= 0){
            return this.myContacts.get(position);
        }
        return null;
    }


    public void printContacts(){

        for(int i = 0; i < myContacts.size(); i++){

            System.out.println( (i+1) + "." +
                    this.myContacts.get(i).getName() + " > " +
                    this.myContacts.get(i).getNumber());
        }

    }

}
