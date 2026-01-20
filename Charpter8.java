package Use_a_cabeca_Java;

public class Charpter8 extends Charpters {
    public Charpter8() {
        i = 0;
        choiseExercices = 0;
        charpter = new String[] {"Temporary"};
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
