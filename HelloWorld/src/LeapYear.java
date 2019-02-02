public class LeapYear {

    public static void main(String[] args){

        isLeapYear(-1);
        isLeapYear(2010);
        isLeapYear(2017);
        isLeapYear(1600);
        isLeapYear(2000);
        isLeapYear(1924);
    }


    public static boolean isLeapYear(int year){
        if(year >= 1 && year <= 9999){
            System.out.println("Year is valid number. "+ year);
            if((year%4==0) &&(year%100!=0) || (year%400==0)){
                System.out.println("Year is a Leap Year. " + year);
                return true;
            }
        }

        System.out.println("Is not a leap year. " + year);
        return false;
    }
}
