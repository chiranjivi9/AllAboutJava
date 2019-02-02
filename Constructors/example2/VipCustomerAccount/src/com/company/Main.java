package com.company;

public class Main {

    public static void main(String[] args) {

        VipCustomerAccount samsAccount = new VipCustomerAccount();
        System.out.println( "Name : " + samsAccount.getCustomerName() + "\n" +
                "Credit Line : " + samsAccount.getCreditLimit() + "\n" +
                "Email : " + samsAccount.getCustomerEmail() );

        System.out.println("");

        VipCustomerAccount johnsAccount = new VipCustomerAccount("John", "john@gmail.com");
        System.out.println("Name : " + johnsAccount.getCustomerName() + "\n" +
                            "Credit Limit : " + johnsAccount.getCreditLimit() + "\n" +
                            "Email : "  + johnsAccount.getCustomerEmail()
                );

        System.out.println("");
        VipCustomerAccount billsAccount = new VipCustomerAccount("Bill Bob", 3400, "bill@gmail.com");
        System.out.println("Name : " + billsAccount.getCustomerName() + "\n" +
                            "Credit Limit : " + billsAccount.getCreditLimit() + "\n" +
                            "Email : " + billsAccount.getCreditLimit()

        );
    }

}
