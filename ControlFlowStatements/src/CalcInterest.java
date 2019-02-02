public class CalcInterest {

    public static void main(String[] args){

        // Calculate the amount with interest rate of 2, 3, 4, 5, 6, 7, 8
        for(double i = 0.5; i < 9; i++){

            System.out.println("10,000 at "+ i + "% interest = " + calculateInterest(10000,i));
        }
        System.out.println("-----------------");
        //Calculate amount with interest rate of 8, 7, 6, 5, 4, 3, 2
        for(double j = 9; j > 1; j--){

            System.out.println("10,000 at "+j+"% interest = " + calculateInterest(10000,j));
        }

    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }
}
