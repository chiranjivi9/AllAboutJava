public class PerfectNumber {

    public static void main(String[] args){

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println("");

    }

    public static boolean isPerfectNumber(int number){

        int sum = 0;
        if(number < 1){
            return false;

        } else {
            for(int i = 1; i<number ; i++){
                if(number%i == 0){
                    System.out.println("" + i);
                    sum += i;
                }
            }
            System.out.println("Sum is" + sum);
            if(sum == number){
                return true;
            }

            return false;
        }
    }
}
