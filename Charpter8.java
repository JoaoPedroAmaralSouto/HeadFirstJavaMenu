package Use_a_cabeca_Java;

public class Charpter8 extends Charpters {
    public Charpter8() {
        charpter = new String[] {"PoolPuzzle"};
    }

    @Override
    protected void execute(){
        while(choiseExercices <= 0 || choiseExercices > charpter.length){
            choiseExercices = VerifyInt.verify(Br.getReader());
        }
        switch(choiseExercices){
            case 1 -> PoolPuzzleCharpter80f76.execute();
            default -> System.out.println("Invalid choice.");
        }
    }
}
