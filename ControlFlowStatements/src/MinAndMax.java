import java.util.Scanner;

public class MinAndMax {

    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int max = 0;
        int min = 0;

        while(true){

            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){

               int number = scanner.nextInt();

               if(number > max){
                   max = number;
               }

               if(number < min){
                   min = number;
               }

            } else {

                System.out.println("Invalid Value");
                break;
            }

            scanner.nextLine();
        }

        System.out.println("Max number is : " + max);
        System.out.println("Min number is : " + min);
        scanner.close();

    }
}
