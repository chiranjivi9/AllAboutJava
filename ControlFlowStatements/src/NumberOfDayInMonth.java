public class NumberOfDayInMonth {


    public static void main(String[] args){

        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);
        getDaysInMonth(12, 10000);
        getDaysInMonth(1, 2010);


    }

    public static boolean isLeapYear(int year){

        if(year < 1 || year > 9999 ){
            System.out.println("Invalid");
            return false;
        } else if (year % 400 == 0 || (year % 4 == 0 && year % 100 > 0)){
            System.out.println("Leap Year " + year);
            return true;
        } else {
            System.out.println("Not a Leap Year " + year);
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {

        if (month < 1 || month > 12 || year < 1 || year > 9999)
//            System.out.println(" Invalid");
            return -1;

        switch(month){

            case 2:
                if(isLeapYear(year)){
                    System.out.println("Feb with 29 days " + year);
                    return 29;
                } else {
                    System.out.println("Feb with 28 days " + year);

                    return 28;

                }
            case 4: case 6: case 9: case 11:
                System.out.println("April, June, Sept, November " + year);
                return 30;


            default:
                System.out.println("January, March, July, August, October, December " + year);
                return 31;
        }
    }
}
