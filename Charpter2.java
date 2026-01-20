package Use_a_cabeca_Java;

public class Charpter2 extends Charpters {
    public Charpter2(){
        charpter = new String[]{"GuessGame", "DrumKitTestDrive", "EchoTestDrive"};
    }

    @Override
    protected void execute(){
        while(choiseExercices <= 0 || choiseExercices > charpter.length){
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