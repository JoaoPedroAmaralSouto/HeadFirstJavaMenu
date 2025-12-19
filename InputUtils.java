package Use_a_cabeca_Java;

public class InputUtils{
    public static void waitEnter(){
        try{
            Br.getReader().readLine();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    protected static void clearTerminal(){
        ClearTerminal.clear();
    }
}