package com.company;

public class Account {

    private int number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;


//    creating my own constructor

    public Account(){

        System.out.println("Empty constructor called.");
    }

    public Account(int number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber){
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;

        System.out.println("\nAccount Constructor called. Congratulations! on your new account");
        System.out.println("Number: " + number + ", Current balance: "+ balance + "," +
                " Customer Name "+ customerName +", Email Address: "+ customerEmailAddress + ", " +
                " Phone number: "+ customerPhoneNumber);

    }



//    Method to deposit amount
    public void deposit(double depositAmount){

        this.balance += depositAmount;
        System.out.println("\nDeposited amount is "+ depositAmount + ". " +
                "Total balance is " + this.balance + ". Customer name: " + customerName);
    }




//    Method to withdraw amount

    public void withdrawAmount(double withdrawAmount ){

        if(this.balance - withdrawAmount < 0){

            System.out.println("Balance low. Cannot make the withdrawal.");
        } else{

            balance -= withdrawAmount;
            System.out.println("Withdraw amount is: " + withdrawAmount + ". Total balance left is :" + this.balance+"\n");
        }
    }

    public int getNumber() {
        System.out.println("The account number is: "+ number);
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        System.out.println("The Balance is: " + balance);
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        System.out.println("The account belongs to: " + customerName);
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        System.out.println("The email address of " + customerName + " is " + customerEmailAddress);
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        System.out.println("The phone number of " + customerName + " is " + customerPhoneNumber);
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}

