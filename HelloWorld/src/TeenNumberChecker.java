public class TeenNumberChecker {

    public static void main(String[] args){
        hasTeen(13,12,14);
        hasTeen(11,0,10);
        hasTeen(11,22,31);
        hasTeen(-13, -17, 19);
    }

    public static boolean hasTeen(int num1, int num2, int num3){


        if( (num1 >= 13 && num1 <= 19)||(num2 >=13 && num2<=19)||(num3 >=13 && num3 <= 19) ){
            System.out.println("the list has a number between 13 and 19.");
            return true;
        }
        System.out.println("The list has no number between the range 13 and 19.");
        return false;
    }
}
