package Use_a_cabeca_Java;

public class Charpter4 extends Charpters{
    public Charpter4(){
        charpter = new String[] {"Puzzle4"};
    }

    protected void execute(){
        while(choiseExercices <= 0 || choiseExercices > charpter.length){
            choiseExercices = VerifyInt.verify(Br.getReader());
        }
        switch (choiseExercices){
            case 1 -> Puzzle4.startPuzzle4();
            default -> System.out.println("Invalid choice");
        }
    }
}