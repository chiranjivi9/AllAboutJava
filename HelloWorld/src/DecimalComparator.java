public class DecimalComparator {


    public static void main(String[] args){

        areEqualByThreeDecimalPlaces(3.175, 3.1756);
    }

    public static boolean areEqualByThreeDecimalPlaces  (double num1, double num2){

        int num11 = (int)( num1 * 1000);
        int num22 = (int)( num2 * 1000);


        if (num11 == num22)
            return true;

        else
            return false;

    }

}
