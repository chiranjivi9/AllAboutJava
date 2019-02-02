public class LastDigitChecker {

    public static void main(String[] args){

        hasSameLastDigit(12, 19, 888);
        hasSameLastDigit(41, 22, 71);
        hasSameLastDigit(23, 32, 42);
        hasSameLastDigit(9, 99, 999);
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3){

        if(number1 >= 10 && number1 <= 1000 && number2 >= 10 && number2 <= 1000 && number3 >= 10 && number3 <= 1000) {
            int originalNumber1 = number1;
            int originalNumber2 = number2;
            int originalNumber3 = number3;
            int remainderNum1 = 0;
            int remainderNum2 = 0;
            int remainderNum3 = 0;
            System.out.println("\nNumber1 : " + number1 + " Number2: " + number2 + " Number3: " + number3);
            remainderNum1 = number1 % 10;
            remainderNum2 = number2 % 10;
            remainderNum3 = number3 % 10;

            if (remainderNum1 == remainderNum2 || remainderNum1 == remainderNum3 || remainderNum2 == remainderNum3) {
                System.out.println("");
                System.out.println("Right most digit of at least two numbers are same");
                System.out.println("The last digits of number1:" + remainderNum1 + " number2: " + remainderNum2 + " number3: " + remainderNum3);

                return true;
            } else {
                System.out.println("False. No rightmost numbers match.");
                return false;
            }
        }

        return false;
    }
}
