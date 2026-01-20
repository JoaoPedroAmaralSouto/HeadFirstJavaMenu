package Use_a_cabeca_Java;

public class Charpter5 extends Charpters{
    public Charpter5(){
        charpter = new String[] {"Battleships"};
    }

    protected void execute(){
        while(choiseExercices <= 0 || choiseExercices > charpter.length){
            choiseExercices = VerifyInt.verify(Br.getReader());
        }
        switch(choiseExercices){
            case 1 -> GameLauncherBattleShip.start();
            default -> System.out.println("Invalid choise.");
        }
    }
}