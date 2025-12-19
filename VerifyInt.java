package Use_a_cabeca_Java;
import java.io.BufferedReader;


public class VerifyInt{
    public static int verify(BufferedReader br){
        try {
            return Integer.parseInt(br.readLine());
        }
        catch (Exception e){
            System.out.println("You have entered an invalid input, please, try enter a number");
            return 0;
        }
    }
}