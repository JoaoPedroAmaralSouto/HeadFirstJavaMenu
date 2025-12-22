package Use_a_cabeca_Java;

public class VerifyStringBattleship {
    public String verify(BufferedReader br){
        try{
            return br.readLine();
        } catch (Exception e) {
            System.out.println("Error trying to read line");
            return null;
        }
    }
}