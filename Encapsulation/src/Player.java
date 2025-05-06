public class Player {

    public String name;
    public int health;
    public String weapon;

//    public void loseHealth(int damage){
//        if(health - damage <= 0 ){
//            System.out.println("Player Out Of the Game");
//        }
//        else{
//            System.out.println("Players health good.");
//        }
//
        public void loseHealth(int damage ){
            health -=damage;
            if(health <= 0){
                System.out.println("Player is knocked out of game");
            }
        }

        public int healthRemaining(){
            return health;
        }

        public void restoreHealth(int extraHealth){

            health +=extraHealth;
            if(health > 100){
                System.out.println("Player Health restored to 100%");
                health =100;
            }
        }

    }

