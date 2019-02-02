public class SumOfDigitis {

    public static void main(String[] args){
        sumDigits(9);
        sumDigits(-45);
        sumDigits(125);

        System.out.println("The sum for number is " + sumDigits(-123));
        System.out.println("The sum for number is " + sumDigits(125));
        System.out.println("The sum for number is " + sumDigits(-9));

    }

    public static int sumDigits(int number){
        int remainingDigit = 0;
        if(number >= 10){
            System.out.println("Number entered is:"+ number);

            while(number>0){
                remainingDigit += number%10;
                number /= 10;
            }
            System.out.println("The sum of digits is: "+remainingDigit);
            return remainingDigit;
        }
        return -1;
    }
}
