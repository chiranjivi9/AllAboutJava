package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Account bobsAccount = new Account();
//        Calling constructor account
        Account alexsAccount = new Account(123344, 200.0,"Alex Francis", "alex@yahoo.com", "(111) 222-4444");
        Account bobsAccount = new Account(123355, 150,"Bob Bing","bob@gmail.com", "(121) 546-1234");

        bobsAccount.withdrawAmount(50.0);
        bobsAccount.deposit(200.0);
        bobsAccount.withdrawAmount(10.0);

        alexsAccount.deposit(10.0);
        alexsAccount.withdrawAmount(5.0);

        bobsAccount.getBalance();
        bobsAccount.getNumber();
        bobsAccount.getCustomerName();
        bobsAccount.getCustomerEmailAddress();
        bobsAccount.getCustomerPhoneNumber();

        bobsAccount.setNumber(123345);

        bobsAccount.getBalance();
        bobsAccount.getNumber();
        bobsAccount.getCustomerName();
        bobsAccount.getCustomerEmailAddress();
        bobsAccount.getCustomerPhoneNumber();


    }
}
