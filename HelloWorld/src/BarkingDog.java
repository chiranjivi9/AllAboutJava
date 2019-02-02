public class BarkingDog {

    public static void main(String[] args){

        boolean barking = true;
        int hourOfTheDay = 0;

        bark(false, 4);

        bark (true,23);

    }

    public static boolean bark(boolean barking, int hourOfTheDay){

        if(hourOfTheDay<0 || hourOfTheDay>23){

            System.out.printf("False");
            return false;
        } else {
            if (barking && hourOfTheDay>8){
                System.out.println("True");
                return true;

            } else if(barking && hourOfTheDay<=23){
                System.out.println("True");
                return true;

            } else {
                System.out.println("False");
                return false;
            }

        }
    }
}
