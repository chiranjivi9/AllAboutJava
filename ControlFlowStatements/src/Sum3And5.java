public class Sum3And5 {

    public static void main(String[] args){
        long sum = 0;
        int count = 0;
        for(int i = 1; i < 1000; i++){

            if((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("Number divisible by 3 and 5 is: " + i);
                sum += i;
                count++;

                if(count == 5){
                    System.out.println("Count has hit limit");
                    break;
                }
            }
        }
        System.out.println(" Sum = " + sum);
    }
}
