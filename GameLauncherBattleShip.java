package Use_a_cabeca_Java;

public class GameLauncherBattleShip{
    public static void start(){
        Board startGame = new Board();
        boolean gameOver = false;
        PlayerBattleship playerBattleship = new PlayerBattleship();
        startGame.setShips();
        startGame.viewShips();
        while(!gameOver){
            playerBattleship.setChoise();
            if(playerBattleship.getChoise().equalsIgnoreCase("exit")){
                gameOver = true;
            }
            else if (startGame.getTotalShips() == 0) {
                System.out.println("Congratulations! You win!");
                gameOver = true;
            } else{
                startGame.verifyHit(playerBattleship.getChoise());
                ClearTerminal.clear();
                startGame.viewShips();
            }
        }
    }
}