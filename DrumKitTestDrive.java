package Use_a_cabeca_Java;

public class DrumKitTestDrive{
    public static void playDrums(){
        InputUtils.clearTerminal();
        DrumKit d = new DrumKit();
        d.playShare();
        d.setShare(false);;
        if(d.getShare() == true){
            d.playShare();
        }
        d.playTopHat();
    }
}