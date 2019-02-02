package com.company;

public class BankAccount {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String phoneNumber;


//    Creating a constructor
    public BankAccount(String number, double balance, String customerName, String customerEmailAddress, String phoneNumber){
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.phoneNumber = phoneNumber;
    }

//    creating a constructor which has default values.
    public BankAccount(String customerName, String customerEmailAddress, String phoneNumber){
        this("00000",100.00, customerName, customerEmailAddress, phoneNumber);
    }

// method to deposit
   public void deposit(int depositAmount){
       this.balance = depositAmount;
       System.out.println("Amount deposited is : " + depositAmount + ". Current balance is : " + this.balance);
   }

//   method to withdraw amount
   public void withdraw(int withdraw){
       if(balance - withdraw < 0){

           System.out.println("Not enough balance. Balance is : " + this.balance);
       } else {

           balance -= withdraw;
           System.out.println("Withdrawal of " + withdraw + " successful. Account Balance is : " + this.balance);
       }
   }

//   Getters and Setters
   public String getNumber(){
       return number;

   }
   public void setNumber(String number){
       this.number = number;

   }

   public double getBalance(){
       return balance;
   }

   public void setBalance(double balance){
       this.balance = balance;

   }

   public String getCustomerName(){
       return customerName;
   }

   public void setCustomerName(String customerName){
       this.customerName = customerName;
   }

   public String getCustomerEmailAddress(){
       return customerEmailAddress;
   }

   public void setCustomerEmailAddress(){
       this.customerEmailAddress = customerEmailAddress;
   }


   public String getPhoneNumber(){
       return phoneNumber;
   }

   public void setPhoneNumber(String phoneNumber){
       this.phoneNumber = phoneNumber;
   }

}
