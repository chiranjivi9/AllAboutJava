public class PlayingCat {

    public static void main(String[] args){
//        boolean isSummer = false;

        isCatPlaying(false, 35);
        isCatPlaying(false, 36);
        isCatPlaying(true, 10);
    }

    public static boolean isCatPlaying(boolean isSummer, int temperature){

        if((temperature >= 25 && temperature <= 35) && isSummer == false){
            System.out.println("Cat is playing");
            return true;
        } else if((temperature >= 25 && temperature <= 45) && isSummer == true){
            System.out.println("Cat is playing");
            return true;
        } else {
            System.out.println("Too hot to play");
            return false;
        }
    }
}
