public class MinutesToYearsAndDaysCalculator {

    public static void main(String[] args){
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }


    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        } else {
            long years = minutes / (24*60*365);
//            long days = minutes % (24*60*60);
            long days = (minutes % 525600) / 60 / 24;
            System.out.println(minutes+" min = "+ years + " y and "+days +" d");
//            System.out.println("years="+years+" & days = "+ days);
        }
    }
}
