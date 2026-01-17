package Use_a_cabeca_Java;

public class GameLauncherBattleShip{
    public static void start(){
        Board startGame = new Board();
        boolean gameOver = false;
        boolean cheat = false;
        PlayerBattleship playerBattleship = new PlayerBattleship();
        ClearTerminal.clear();
        startGame.setShips();
        startGame.viewShips();
        while(!gameOver){
            if (startGame.getShips().isEmpty()) {
                System.out.println("Congratulations! You win!");
                gameOver = true;
            }
            else{
                playerBattleship.setChoise();
                if(playerBattleship.getChoise().equalsIgnoreCase("cheat")){
                    cheat = true;
                }
                if(playerBattleship.getChoise().equalsIgnoreCase("exit")){
                    gameOver = true;
                }
                else if(playerBattleship.getChoise().isEmpty()){
                    System.out.println("You set ENTER without choosing any position, please, try again a valid input");
                }
                else {
                    startGame.verifyHit(playerBattleship.getChoise());
                    ClearTerminal.clear();
                    if (!cheat) {
                        startGame.viewShips();
                    } else {
                        startGame.cheatedViewShips();
                    }
                }
            }
        }
        System.out.println("Number of attempts: " + startGame.getContChoises());
    }
}