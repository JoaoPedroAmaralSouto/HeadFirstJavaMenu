package Use_a_cabeca_Java;

public class Charpter1 extends Charpters {
    public Charpter1(){
        choiseExercices = 0;
        i = 0;
        charpter = new String [] {"DooBee", "PhraseOMatic", "Shuffle1"};
    }

    @Override
    protected void execute(){
        while(choiseExercices <= 0 || choiseExercices > charpter.length){
            choiseExercices = VerifyInt.verify(Br.getReader());
        }
        switch (choiseExercices){
            case 1 -> DooBee.dooBee();
            case 2 -> PhraseOMatic.createPhrase();
            case 3 -> Shuffle1.createPhrase();
            default -> System.out.println("Invalid choise.");
        }
    }
}