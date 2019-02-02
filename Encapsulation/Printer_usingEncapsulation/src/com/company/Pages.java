package com.company;

public class Pages {

    private int numberOfPages;
    private int pagesUtilized;
    private double tonerLevel;


    public Pages(double tonerLevel){

        this.numberOfPages = 1000;
        this.pagesUtilized = 0;

        if(tonerLevel > -1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

    }


    public void printOnSinglePage(int numberOfPrints){
        if(numberOfPrints <= 0){
            System.out.println("Cannot print pages less than 0.");


        } else if(numberOfPrints > 0){
            numberOfPages -= numberOfPrints;
            tonerLevel -= 0.5;
            System.out.println("Single Page Print.\nTotal prints are :" + numberOfPrints +". Total pages left in printer : " + numberOfPages);
            System.out.println("Ink left : " + tonerLevel);

        }

    }


    public void printOnBothSides(int numberOfPrints){
        if(numberOfPrints <= 0){
            System.out.println("Cannot print pages less than 0.");

        } else if(numberOfPrints > 0){
            numberOfPages -= (numberOfPrints * 0.5);
            tonerLevel -= 1.0;
            System.out.println("Double Page Print.\nTotal prints are : " + numberOfPrints +". Total pages left in printer : " + numberOfPages);
            System.out.println("Ink left : " + tonerLevel + "%");
        }
    }

    public void pageRefill(){

        this.numberOfPages = 1000;
        System.out.println("Pages refilled. Number of pages available to print : " + numberOfPages);

    }

    public double tonerRefil(double addToner){

        if(addToner > 0 && addToner <= 100) {
            if (this.tonerLevel + addToner > 100) {
                return -1;
            }

            this.tonerLevel += addToner;
            return this.tonerLevel;

        } else {
            return -1;
        }
    }

    public int getNumberOfPage(){
        return numberOfPages;
    }

    public int getPagesUtilized() {
        return pagesUtilized;
    }
}
