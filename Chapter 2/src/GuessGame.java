import java.util.Random;

public class GuessGame {
    
    public void startGame() {
        //Create 3 player instances
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        
        //Boolean to cbreak out of while loop
        Boolean p1g = false, p2g = false, p3g = false;
        
        //Create the random number
        Random rand = new Random();
        int number = rand.nextInt(10);

        //Start the guessing
        while(true) {
            System.out.println("The number to guess is " + number);
            
            //Call the player guess method to change the number 
            p1.guess();
            p2.guess();
            p3.guess();
    
            if (p1.number == number) {
                p1g = true;
                System.out.println("Player 1's guess " + p1.number + " was correct");
            }
            if (p2.number == number){
                p2g = true;
                System.out.println("Player 2's guess " + p2.number + " was correct");
            }
            if(p3.number == number) {
                p3g = true;
                System.out.println("Player 3's guess " + p3.number + " was correct");
            }
            
            //If any of the players guessed correctly break out of the loop
            if (p1g == true || p2g == true || p3g == true) {
                System.out.println("Thanks for playing!");
                break;
            }
            else {
                System.out.println("Try again");
            }
        }

    }
    
}
