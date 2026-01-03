package Use_a_cabeca_Java;
import java.io.IOException;


public class PlayerBattleship {
    private String choise = null;

    protected String getChoise() {
        return choise;
    }

    protected void setChoise() {
        try{
            choise = Br.getReader().readLine();
        }
        catch (Exception e){
            System.err.println("ERROR: " + e.getMessage());
        }
    }
}