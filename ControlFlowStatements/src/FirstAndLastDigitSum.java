public class FirstAndLastDigitSum {

    public static void main(String[] args){

        System.out.println("Result " + sumFirstAndLastDigit(123));
        System.out.println("Result " + sumFirstAndLastDigit(-112));
        System.out.println("Result " + sumFirstAndLastDigit(0));
        System.out.println("Result " + sumFirstAndLastDigit(123456));
    }

    public static int sumFirstAndLastDigit(int number){

        int reverse = 0;
        int sum = 0;
        int original = number;

        if(number <= 0){

            return -1;
        } else {

            while( number != 0 ){

                int remainder = number % 10;
                reverse = reverse * 10 + remainder;
                number /= 10;

            }

            int first = reverse % 10;
            int last = original % 10;
            sum = first + last;
            System.out.println("Sum is : " + sum);

            return sum;
        }
    }
}
