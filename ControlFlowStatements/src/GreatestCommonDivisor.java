public class GreatestCommonDivisor {

    public static void main(String[] args){

        System.out.println("GCD is : " + getGreatestCommonDivisor(25, 15));
        System.out.println("GCD is: " + getGreatestCommonDivisor(12, 30));
        System.out.println("GCD is: " + getGreatestCommonDivisor(9, 18));
        System.out.println("GCD is: " +getGreatestCommonDivisor(18, 153));

    }

    public static int getGreatestCommonDivisor(int first, int second){

        int original1 = first;
        int original2 = second;
        int x = 2;

        if( first < 10 || second < 10){
            return -1;
        } else {

            if(first>second){

                for( int i = second; i > 0; i--){
                    if((first % i == 0) && (second % i == 0)){
                        return i;
                    }
                }
            } else if (second > first){

                for (int j = first; j > 0; j-- ){
                    if((first % j == 0) && (second % j == 0)){
                        return j;
                    }
                }
            }
        }
        return -1;
    }
}
