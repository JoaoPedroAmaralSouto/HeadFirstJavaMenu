package Use_a_cabeca_Java;

public class Main{
    public static void main (String[] args){
        int choise = 0;
        int choiseExercices = 0;
        String[] exercices= {"Charpter 1", "Charpter 2", "Charpter 3", "Exit"};
        int i;
        while(choise != exercices.length) {
            InputUtils.clearTerminal();
            System.out.println("Head first exercices");
            i = 0;
            while (i < exercices.length) {
                System.out.println(i + 1 + "-" + exercices[i]);
                i += 1;
            }
            System.out.println("Select a number to stop or continue the loop");
            choise = 0;
            while (choise == 0) {
                choise = VerifyInt.verify(Br.getReader());
            }
            if(choise == 1){
                InputUtils.clearTerminal();
                String[] charpter1 = {"DooBee", "Phrase-o-matic", "Shuffle1"};
                System.out.println("Charpter 1");
                i = 0;
                while(i < charpter1.length){
                    System.out.println(i + 1 + "-" + charpter1[i]);
                    i += 1;
                }
                System.out.println("Select a exercice above");
                choiseExercices = 0;
                while(choiseExercices == 0){
                    choiseExercices = VerifyInt.verify(Br.getReader());
                }
                if(choiseExercices == 1){
                    DooBee.dooBee();
                }
                else if(choiseExercices == 2){
                    PhraseOMatic.createPhrase();
                }
                else if(choiseExercices == 3){
                    Shuffle1.createPhrase();
                }
            }
            else if(choise == 2){
                InputUtils.clearTerminal();
                String[] charpter2 = {"GuessGame", "DrumKitTestDrive", "EchoTestDrive"};
                System.out.println("Charpter 2");
                i = 0;
                while(i < charpter2.length){
                    System.out.println(i + 1 + "-" + charpter2[i]);
                    i += 1;
                }
                System.out.println("Select a exercice above");
                choiseExercices = 0;
                while(choiseExercices == 0){
                    choiseExercices = VerifyInt.verify(Br.getReader());
                }
                if(choiseExercices == 1){
                    GameLauncher.start();
                }
                else if(choiseExercices == 2){
                    DrumKitTestDrive.playDrums();
                }
                else if(choiseExercices == 3){
                    EchoTestDrive.playEchoTestDrive();
                }
            }
            else if(choise == 3){
                InputUtils.clearTerminal();
                String[] charpter3 = {"TestArrays", "Triangle"};
                System.out.println("Charpter 3");
                i = 0;
                while(i < charpter3.length){
                    System.out.println(i + 1 + "-" + charpter3[i]);
                    i += 1;
                }
                System.out.println("Select a exercice above");
                choiseExercices = 0;
                while(choiseExercices == 0){
                    choiseExercices = VerifyInt.verify(Br.getReader());
                }
                if(choiseExercices == 1){
                    InputUtils.clearTerminal();
                    System.out.println(charpter3[0]);
                    TestArrays.test();
                }
                if(choiseExercices == 2){
                    InputUtils.clearTerminal();
                    System.out.println(charpter3[1]);
                    Triangle.showTriangles();
                }
            }
            /*else if(choise == 4){
                InputUtils.clearTerminal();
                System.out.println(exercices[choise - 1]);
                String[] charpter4 = {};
                i = 0;
            }*/
            if(choise != exercices.length && choise != 0){
                System.out.println("Enter any key to go back to the menu");
                InputUtils.waitEnter();
            }
        }
    }
}
