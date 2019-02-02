public class SumOdd {


    public static void main(String[] args){
        isOdd(2);
        isOdd(3);
        isOdd(99);
        isOdd(-1);
//        isOdd(11,50);
//        isOdd(1,10);

    }


    public static boolean isOdd(int number) {
        if (number <= 0 || number % 2 == 0)
            return false;

        return true;
    }


    public static int sumOdd(int start, int end) {
        int sum = 0;

        if ((end >= start) && (start > 0) && (end > 0)) {

            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        }
        return -1;
    }
}
