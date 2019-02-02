public class NumberToWords {

    public static void main(String[] args){
//        System.out.println("reverse number is: " + reverse(123)); // testing reverse method.
        numberToWords(100);
        numberToWords(138);
        numberToWords(1010);
        numberToWords(-12);
        numberToWords(1450);
    }

    public static int getDigitCount (int number) {

        int Onumber = number;

        int cntr = 0;

        if (number >= 0) {

            int val = 0;

            while (number > 0) {

                val = number % 10;

                number = number /10;

                cntr ++;

            }

        } else {

            return -1;

        } if (Onumber == 0) {

            return 1;

        } else {

            return cntr;

        }

    }

    public static int reverse(int number) {

        int reversenum = 0;

        while (number > 0 || number < 0) {

            reversenum = reversenum * 10;

            reversenum = reversenum + number % 10;

            number = number / 10;

        }

        return reversenum;

    }

    public static void numberToWords(int number) {

        if (number >= 0) {

            int rev_num = reverse(number);

            int diff_cnt = getDigitCount(number) - getDigitCount(rev_num);

            int val = 0;

            while (rev_num > 0) {

                val = rev_num % 10;

                rev_num = rev_num / 10;

                switch (val){

                    case 0:

                        System.out.println("Zero");

                        break;

                    case 1 :

                        System.out.println("One");

                        break;

                    case 2:

                        System.out.println("Two");

                        break;

                    case 3:

                        System.out.println("Three");

                        break;

                    case 4:

                        System.out.println("Four");

                        break;

                    case 5:

                        System.out.println("Five");

                        break;

                    case 6:

                        System.out.println("Six");

                        break;

                    case 7:

                        System.out.println("Seven");

                        break;

                    case 8:

                        System.out.println("Eight");

                        break;

                    case 9:

                        System.out.println("Nine");

                        break;

                }

            }

            while (diff_cnt != 0) {

                System.out.println("Zero");

                diff_cnt --;

            }

        } else {

            System.out.println("Invalid Value");

        }

    }

}
