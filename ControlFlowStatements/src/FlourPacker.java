public class FlourPacker {

    public static void main(String[] args){
        System.out.println("Answer : " + canPack(1,0,4));
        System.out.println("Answer : " + canPack(1,0,5));
        System.out.println("Answer : " + canPack(0,5,4));
        System.out.println("Answer : " + canPack(2,2,12));
        System.out.println("Answer : " + canPack(-3,2,12));
        System.out.println("Answer : " + canPack(0,5,4));
        System.out.println("Answer : " + canPack(2,1,5));
        System.out.println("Answer : " + canPack(5,3,24));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal){

        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }

        bigCount *= 5;
        int sum = 0;

        for(int i = 0; i <= bigCount; i += 5){

            sum = 0;
            sum += i;

            for(int j = 0; j <= smallCount; j++){

                if(sum == goal){
                    return true;
                }

                sum++;
            }
        }

        return false;
    }
}
