package Use_a_cabeca_Java;

public class DrumKit{
    private boolean topHat = true;
    private boolean share = true;
    public void playShare(){
        System.out.println("bang bang ba-bang");
    }
    public void playTopHat(){
        System.out.println("ding ding da-ding");
    }
    public void setTopHat(boolean b){
        topHat = b;
    }
    public boolean getTopHat(){
        return topHat;
    }
    public void setShare(boolean b){
        share = b;
    }
    public boolean getShare(){
        return share;
    }
}
