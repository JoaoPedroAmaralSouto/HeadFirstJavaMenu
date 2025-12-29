package Use_a_cabeca_Java;

public class GameLauncherBattleShip {
    public static void start(){
        Board startGame = new Board();
        startGame.setShips();
        startGame.viewShips();
    }
}