package Use_a_cabeca_Java;

public class Charpter4 extends Charpters{
    public Charpter4(){
        i = 0;
        choiseExercices = 0;
        charpter = new String[] {"Puzzle4"};
    }

    protected void execute(){
        choiseExercices = 0;
        i = 0;
        while(choiseExercices <= 0 || choiseExercices > charpter.length){
            choiseExercices = VerifyInt.verify(Br.getReader());
            i += 1;
        }
        switch (choiseExercices){
            case 1 -> Puzzle4.startPuzzle4();
            default -> System.out.println("Invalid choice");
        }
    }
}