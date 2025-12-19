package Use_a_cabeca_Java;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Br{
    protected static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedReader getReader(){
        return br;
    }
}