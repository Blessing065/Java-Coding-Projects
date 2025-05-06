public class Main {
    public static void main(String[] args) {


       int highScore = calculateScore(true , 800 , 5 , 100);
       System.out.println("The high score is " + highScore);

       System.out.println( "The next high score " + calculateScore(true, 10000, 8 , 200));

        System.out.println("I am " +  calculateMyAge(2001) + " years old");
    }

    public static int calculateScore( boolean gameOver, int score, int levelCompleted , int bonus ){

        int finalScore = score;

        if(gameOver){
            finalScore += (levelCompleted * bonus);
            finalScore +=1000;
        }
        return finalScore;

    }

    public static int calculateMyAge(int dateOfBirth){
        return (2023 - dateOfBirth);
    }
}
