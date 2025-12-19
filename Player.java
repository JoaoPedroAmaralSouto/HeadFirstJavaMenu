package Use_a_cabeca_Java;

public class Player{
    private static int attempts = 0;
    private static int lastNumberChosen = 0;
    public static int chosenNumber(){
        lastNumberChosen = VerifyInt.verify(Br.getReader());
        return lastNumberChosen;
    }
    public void setAttempts(int x){
        if(x > 0){
            attempts += x;
        }
    }
    public int getAttempts() {
        return attempts;
    }
}
