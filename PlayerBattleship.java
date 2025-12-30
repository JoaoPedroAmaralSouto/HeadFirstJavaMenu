package Use_a_cabeca_Java;

public class PlayerBattleship {
    protected String choise = null;
    protected int contChoises = 0;
    protected String setChoise(){
        choise = VerifyStringBattleship.verify(Br.getReader());
        return choise;
    }
}