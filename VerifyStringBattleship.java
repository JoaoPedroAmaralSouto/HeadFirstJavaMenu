package Use_a_cabeca_Java;
import java.io.BufferedReader;

public class VerifyStringBattleship {
    public static String verify(BufferedReader br){
        try{
            return br.readLine();
        } catch (Exception e) {
            System.out.println("Error trying to read line");
            return null;
        }
    }
}