package Use_a_cabeca_Java;
import java.io.BufferedReader;
import java.io.IOException;

public class Br{
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedReader getReader(){
        return br;
    }
}