package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Contacts {

    // Store Contacts, Modify, Remove, Search
    // Contact - name and number both as strings
    private String name;
    private String number;

    public Contacts(String name, String number) {
//        this.contacts = contacts;
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public static Contacts createContacts(String name, String number){
        return new Contacts(name, number);
    }


}
