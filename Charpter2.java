package Use_a_cabeca_Java;

public class Charpter2 extends Charpters {
    protected static void showCharpter2(){
        InputUtils.clearTerminal();
        charpter = new String[]{"GuessGame", "DrumKitTestDrive", "EchoTestDrive"};
        System.out.println("Charpter 2");
        i = 0;
        while(i < charpter.length){
            System.out.println(i + 1 + "-" + charpter[i]);
            i += 1;
        }
        System.out.println("Select a exercice above");
        choiseExercices = 0;
        while(choiseExercices == 0){
            choiseExercices = VerifyInt.verify(Br.getReader());
        }
        switch (choiseExercices){
            case 1 -> GameLauncher.start();
            case 2 ->  DrumKitTestDrive.playDrums();
            case 3 -> EchoTestDrive.playEchoTestDrive();
            default -> { }
        }
    }
}