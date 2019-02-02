import java.util.Scanner;

public class GetUserInput {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (true){

            int order = counter + 1;

            System.out.println("Enter #"+ order + ": " );

            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){

                int number = scanner.nextInt();
                counter++;

                sum += number;

                if(counter == 10){

                    break;
                }

            } else {

                System.out.println("Invalid Number");

            }

            // To remove the invalid entry and make sure we dont hit infite loop we use the below statement.
            // Handle end of line.
            scanner.nextLine();


        }
        System.out.println("The total sum is :" + sum);
        scanner.close();

    }
}
