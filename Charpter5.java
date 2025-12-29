package Use_a_cabeca_Java;

public class Charpter5 extends Charpters{
    public Charpter5(){
        i = 0;
        choiseExercices = 0;
        charpter = new String[] {"Battleships"}
    }

    protected void execute(){
        i = 0;
        choiseExercices = 0;
        choiseExercices = VerifyInt.verify(Br.getReader());
        switch(choiseExercices){
            case 1 -> GameLauncherBattleShip.start();
            default -> System.out.println("Invalid choise.");
        }
    }
}