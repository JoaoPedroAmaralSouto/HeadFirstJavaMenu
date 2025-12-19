package Use_a_cabeca_Java;

public class ClearTerminal{
    public static void clear(){
        try {
            String os = System.getProperty("os.name").toLowerCase();
            ProcessBuilder pb;
            if(os.contains("win")){
                pb = new ProcessBuilder("cmd", "/c", "cls");
            }
            else{
                pb = new ProcessBuilder("clear");
            }
            pb.inheritIO().start().waitFor();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}