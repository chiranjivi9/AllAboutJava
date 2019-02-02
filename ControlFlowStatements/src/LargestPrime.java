public class LargestPrime {
    public static void main(String[] args){
//        System.out.println("Number is : "+ getLargestPrime(45));
//        System.out.println();
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(-5));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(7));


    }

    public static int getLargestPrime(int number){
        int original = number;
//        int i = 0;
        int largetstPrime = -1;

//        if(number <= 0 )
        for(int i = 2 ; i <= number; i++){

            if(number%i == 0 && isPrime(i)){

                largetstPrime = i;
            }

        }
        return largetstPrime;
    }

    public static boolean isPrime(int number){
        for(int i = 2; i <= (long)Math.sqrt(number); i++){

            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
