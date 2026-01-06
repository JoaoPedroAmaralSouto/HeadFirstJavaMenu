package Use_a_cabeca_Java;

public class GameLauncherBattleShip{
    public static void start(){
        Board startGame = new Board();
        boolean gameOver = false;
        boolean cheat = false;
        PlayerBattleship playerBattleship = new PlayerBattleship();
        startGame.setShips();
        startGame.viewShips();
        while(!gameOver){
            playerBattleship.setChoise();
            if(playerBattleship.getChoise().equalsIgnoreCase("cheat")){
                cheat = true;
            }
            if(playerBattleship.getChoise().equalsIgnoreCase("exit")){
                gameOver = true;
            }
            else if (startGame.getTotalShips() == 0) {
                System.out.println("Congratulations! You win!");
                gameOver = true;
            }
            else{
                if(!cheat){
                    startGame.verifyHit(playerBattleship.getChoise());
                    ClearTerminal.clear();
                    startGame.viewShips();
                }
                else if(cheat){
                    startGame.verifyHit(playerBattleship.getChoise());
                    ClearTerminal.clear();
                    startGame.cheatedViewShips();
                }
            }
        }
        System.out.println("Number of attempts: " + startGame.getContChoises());
    }
}