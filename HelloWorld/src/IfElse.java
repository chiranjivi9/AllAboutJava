public class IfElse {


    public static void main(String[] args){
        int score = 10000;
        boolean gameOver = true;
        int levelCompleted = 8;
        int bonus = 200;

        int highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("The final score is: " + highScore);

        score = 800;
        levelCompleted = 6;
        bonus = 100;
        highScore = calculateScore(gameOver, score, levelCompleted, bonus );
        System.out.println("The final score is: "+ highScore);

        int highScoreNow = calculateHighScorePosition(900);
        displayHighScorePosition("CJ", highScoreNow);

        highScoreNow = calculateHighScorePosition(1500);
        displayHighScorePosition("Amy", highScoreNow);

        highScoreNow = calculateHighScorePosition(400);
        displayHighScorePosition("Dex", highScoreNow);

        highScoreNow = calculateHighScorePosition(50);
        displayHighScorePosition("Deb", highScoreNow);


    }



    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }

        return -1;

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName +" managed to get the " + highScorePosition + "st position on the score board");
    }

    public static int calculateHighScorePosition(int highScore){
        if(highScore>=1000){
            return 1;
        } else if(highScore>=500 && highScore<1000) {
            return 2;
        } else if (highScore>=100 && highScore <500){
            return 3;
        } else {
            return 4;
        }
    }
}
