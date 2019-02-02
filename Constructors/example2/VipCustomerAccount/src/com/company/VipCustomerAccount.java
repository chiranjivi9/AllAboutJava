package com.company;

public class VipCustomerAccount {

    private String customerName;
    private double creditLimit;
    private String customerEmail;

//  Creating constructor for the class

//    Constructor with all default values
    public VipCustomerAccount(){
        this("Default Name", 5000.00, "default@gmail.com");
        System.out.println("Default constructor called.(All default values)");
    }

    //  Constructor with ONE default value
    public VipCustomerAccount(String customerName, String customerEmail){
//        this(customerName, 5500.00 , customerEmail);
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        System.out.println("Constructor with one default value");

    }


//  Constructor saving all fields
    public VipCustomerAccount(String customerName, double creditLimit, String customerEmail){
        System.out.println("Constructor saving all three values");
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.customerEmail = customerEmail;
    }




    // getters and setters
    public String getCustomerName(){
        return customerName;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public double getCreditLimit(){
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit){
        this.creditLimit = creditLimit;
    }

    public String getCustomerEmail(){
        return  customerEmail;
    }

    public void setCustomerEmail(String customerEmail){
        this.customerEmail = customerEmail;
    }
}
