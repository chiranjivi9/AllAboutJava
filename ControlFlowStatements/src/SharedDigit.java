public class SharedDigit {

    public static void main(String[] args){
        hasSharedDigit(12, 21);

        hasSharedDigit(11,22);

        hasSharedDigit(0, -1);

    }

    public static boolean hasSharedDigit(int num1, int num2){
        if(num1>= 10 && num1 <= 99 && num2>= 10 && num2<=99){
            int original1 = num1;
            int original2 = num2;
            int remainderNumber1 = 0;
            int remainderNumber2 = 0;

            remainderNumber1 = num1%10;
            num1 /= 10;

            System.out.println("remainder1 = "+ remainderNumber1);
            System.out.println("number1/10 =" + num1);

            remainderNumber2 = num2%10;
            num2 /= 10;

            System.out.println("remainder1 = "+ remainderNumber2);
            System.out.println("number1/10 =" + num2);

            if(remainderNumber1 == remainderNumber2 || remainderNumber1 == num2 || num1 == remainderNumber2 || num1 == num2){
                System.out.println("Number 1: " + original1 + " is present in Number 2: " + original2);
                System.out.println("true");

                return true;
            }
        } else {
            System.out.println("Number 1: " + num1 );
            System.out.println("Number 2: "+ num2);
            System.out.printf("false");
            return false;
        }

//        System.out.println("false");
        return false;
    }
}
