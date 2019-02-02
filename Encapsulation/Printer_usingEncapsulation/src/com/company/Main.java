package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

//
        Pages pagesToPrint = new Pages(100);

//        pagesToPrint.printOnSinglePage(15);
        System.out.println("");
        pagesToPrint.printOnBothSides(9);

        pagesToPrint.tonerRefil(20);
        pagesToPrint.pageRefill();

    }
}
