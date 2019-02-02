public class EvenDigitSum {

    public static void main(String[] args){
        System.out.println(""+ getEvenDigitSum(12345678));
        System.out.println(""+ getEvenDigitSum(13579));
        System.out.println(""+ getEvenDigitSum(-123));
        System.out.println(""+ getEvenDigitSum(123));
    }

    public static int getEvenDigitSum(int number){
        int reverse = 0;
        int sum = 0;
        int original = number;
        if(number < 0){

            return -1;
        } else {

            while(number!=0) {

                int remainder = number % 10;
                if(remainder % 2 == 0){

                    sum += remainder;
                }
                reverse = reverse * 10 + remainder;
                number /= 10;
            }
            System.out.println("Even sum is:" + sum);
            return sum;
        }
    }
}
