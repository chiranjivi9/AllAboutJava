public class EqualSumChecker {

    public static void main(String[] args){
        hasEqualSum(1,2,3);
        hasEqualSum(1,-1,0);
        hasEqualSum(1,4,2);
        hasEqualSum(0,0, 0);
        hasEqualSum(1,1,1);
        hasEqualSum(1,1,2);
    }

    public static boolean hasEqualSum(int num1, int num2, int sum){

        if(num1+num2==sum){
            System.out.println(num1+"+"+num2+"="+sum + " The code returns true");
            return true;
        }
        System.out.println(num1 + "+"+ num2+"!="+ sum +" " +
                "The addition of the numbers don't match the third parameter. The code return false");
        return false;
    }
}
