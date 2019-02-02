import java.sql.SQLOutput;

public class Switch {

    public static void main(String[] args){
        System.out.println("Hello, Switches!");

        char var = 'B';

        switch (var){
            case 'A':
                System.out.println("A accessed.");
                break;
            case 'B':
                System.out.println("B accessed.");
                break;
            case 'C':
                System.out.println("C accessed.");
                break;
            case 'D': case 'E': case 'F':
                System.out.println("D, E, F accessed.");
                break;

             default:
                 System.out.println("None accessed.");
                 break;
        }
    }
}
