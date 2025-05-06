public class MethodChallenge {
    public static void main(String[] args) {

        //Calling displaying high score method
        displayHighScore("Nkateko", 7);

        //Calling calculate and display high score methods combined

        displayHighScore("Blessing",calculateHighScorePosition(1500));
        displayHighScore("Junaid",calculateHighScorePosition(1000));
        displayHighScore("Mashele",calculateHighScorePosition(500));
        displayHighScore("Blessing",calculateHighScorePosition(100));
                displayHighScore("Blessed",calculateHighScorePosition(25));


    }

    //Method for displaying high score.
    public static void displayHighScore(String playerName , int playerPosition){
        System.out.println(playerName + " managed to get into position " + playerPosition +
                           " on the high score list.");
    }

    //Method for calculating the high score position

    public static int calculateHighScorePosition(int playerScore){


        if(playerScore >= 1000){
            return 1;
        }
        else if((playerScore >= 500 )){
             return 2;
        }
        else if ((playerScore >= 100)){
             return 3;
        }
        else {return 4;}
    }
}
