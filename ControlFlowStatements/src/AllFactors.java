public class AllFactors {

    public static void main(String[] args){

        printFactor(10);
        System.out.println("");
        printFactor(32);
        System.out.println("");
        printFactor(6);
        System.out.println("");
        printFactor(-1);
    }

    public static void printFactor(int number){

        if(number < 1){
            System.out.println("Invalid Value");
        } else {

            for(int i = number; i > 0; i--){
                if(number%i == 0){
                    System.out.println("The factors are: " + i);
                }

            }
        }
    }
}
