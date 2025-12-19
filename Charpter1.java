package Use_a_cabeca_Java;

public class Charpter1 extends Charpters {
    protected static void showCharpter1(){
        InputUtils.clearTerminal();
        charpter = new String[]{"DooBee", "Phrase-o-matic", "Shuffle1"};
        System.out.println("Charpter 1");
        i = 0;
        while(i < charpter.length){
            System.out.println(i + 1 + "-" + charpter[i]);
            i += 1;
        }
        System.out.println("Select a exercice above");
        choiseExercices = 0;
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