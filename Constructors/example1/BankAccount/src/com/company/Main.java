package com.company;

public class Main {

    public static void main(String[] args) {

//        creating an object of type BankAccount
        BankAccount billsAccount = new BankAccount("Bill", "bill@gmail.com", "(123) 333-4444");
        System.out.println(" Default Account Number is : " + billsAccount.getNumber() + "\n" +
                " Default balance is : " + billsAccount.getBalance() + "\n" +
                " Customer Name : " + billsAccount.getCustomerName() + "\n" +
                " Customer Email : " + billsAccount.getCustomerEmailAddress() + "\n" +
                " Customer Phone : " + billsAccount.getPhoneNumber()
                );

        System.out.println("");
        billsAccount.setNumber("12344");
        billsAccount.deposit(200);

        System.out.println(" Default Account Number is : " + billsAccount.getNumber() + "\n" +
                " Default balance is : " + billsAccount.getBalance() + "\n" +
                " Customer Name : " + billsAccount.getCustomerName() + "\n" +
                " Customer Email : " + billsAccount.getCustomerEmailAddress() + "\n" +
                " Customer Phone : " + billsAccount.getPhoneNumber()
        );

    }
}
