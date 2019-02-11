package com.company;

public class Main {

    public static void main(String[] args) {

// Creating a Bank object
        Bank bank = new Bank("Bank of America");

        // Adding values
        bank.addBranch("Cincinnati");

        bank.addCustomer("Cincinnati", "Bob", 100.50);
        bank.addCustomer("Cincinnati", "Mike", 50.25);
        bank.addCustomer("Cincinnati", "Jada", 200.99);

        bank.addBranch("New York");
        bank.addCustomer("New York", "Smit", 250.50);

        bank.addCustomerTrasaction("New York", "Smit", 50.00);

        bank.addCustomerTrasaction("Cincinnati", "Bob", 100.00);
        bank.addCustomerTrasaction("Cincinnati", "Mike", 50.50);
        bank.addCustomerTrasaction("Cincinnati", "Bob", 25.10);

        bank.addBranch("Sfo");
        bank.addCustomer("Sfo", "Jerry", 250.00d);

        System.out.println("");
        bank.listCustomers("Cincinnati", true);
        System.out.println("");
        bank.listCustomers("New York", true);
        
    }
}
