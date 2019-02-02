public class DayOfTheWeek {


    public static void main(String[] args){

        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(0);
        printDayOfTheWeek(10 );

    }


    public static void printDayOfTheWeek(int day){

        switch (day){
            case 0:
                System.out.println("Its Sunday!");
                break;
            case 1:
                System.out.println("Its Monday!");
                break;

            case 2:
                System.out.println("Its Tuesday!");
                break;

            case 3:
                System.out.println("Its Wednesday!");
                break;

            case 4:
                System.out.println("Its Thursday!");
                break;


            case 5:
                System.out.println("Its Friday!");
                break;


            case 6:
                System.out.println("Its Saturday!");
                break;

            default:
                System.out.println("Invalid Value Entered.");

            }
    }
}
