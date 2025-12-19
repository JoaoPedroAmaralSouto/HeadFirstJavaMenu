package Use_a_cabeca_Java;
import java.util.Random;

public class GuessGame{
    public void startGame(){
        int secret = (int) (Math.random() * 10);
        int tryAgain = 1;
        int choice = 0;
        Player p1 = new Player();
        InputUtils.clearTerminal();
        System.out.println("Guess a number between 0 and 9");
        while(tryAgain == 1){
            choice = p1.chosenNumber();
            if (choice < 0 || choice > 9) {;
                System.out.println("Invalid guess, try again");
                tryAgain = 1;
            }
            else if(choice == secret){
                System.out.println("Correct guess, congratulations!");
                tryAgain = 0;
                p1.setAttempts(1);
                System.out.println("Number of attemps: " + p1.getAttempts());
            }
            else if(choice != secret){
                System.out.println("Wrong guess, try again");
                p1.setAttempts(1);
                tryAgain = 1;
            }
        }
    }
}
