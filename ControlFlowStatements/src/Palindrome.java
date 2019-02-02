public class Palindrome {
    public static void main(String[] args){

        System.out.println("" + isPalindrome(121) );
        System.out.printf(""+ isPalindrome(1321));
        System.out.printf(""+ isPalindrome(0));
        System.out.printf("" + isPalindrome(-121));


    }


// 101 -> 101 % 10 = 1;
// 101 / 10 -> 10
// 10 % 10 -> 0
// 10 / 10 -> 1
// 1 % 10 -> 1
    public static boolean isPalindrome(int number){
        System.out.println("Number passed " + number);
        int original = number;
        int remainder = 0;
        int reverse = 0;

        while(number != 0){
            remainder = number%10;
            reverse = reverse * 10 + remainder;
            number/= 10;
        }

        System.out.println("Reverse "+ reverse);
//        System.out.println("Number" + number);
//        System.out.println("" + original);

        if(original == reverse){
            System.out.println("Number is a palindrome.");
            return true;
        } else {
            System.out.println("Number is not a Palindrome");
            return false;
        }
    }
}
