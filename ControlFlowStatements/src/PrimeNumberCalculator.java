public class PrimeNumberCalculator {

    public static void main(String[] args){
        int count = 0;

        for(int i = 11; i < 100; i++){

            if(isPrime(i)){
                count++;
                System.out.println("Number " + i+ " is a Prime number.");

                if(count == 50){
                    System.out.println("Exiting for loop as the count hits the limit. i.e("+count+")" );
                    break;
                }
            }
        }
        System.out.println("****************");
//        Testing methods
//        isPrime(7);
//        isPrime(1);
//        isPrime(20);
//        isPrime(2);

    }

    // Method to find Prime number.
    public static boolean isPrime(int num){
         if (num == 1){
             System.out.println("1 is not a Prime Number." +
                     "(The definition of a prime number is a positive integer that has " +
                     "exactly two positive divisors. " +
                     "However, 1 only has one positive divisor (1 itself), so it is not prime.)");
              return false;
         }

         for(int i = 2; i <= (long)Math.sqrt(num); i++){
             if(num % i == 0){

//                 System.out.println("Number is not a prime number " + num);
                 return false;
             }
         }

//         System.out.println("Number is Prime number " + num);
         return true;
    }
}
