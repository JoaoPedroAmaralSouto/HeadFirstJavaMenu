package Use_a_cabeca_Java;

public class DooBee{
    public static void dooBee(){
        int x = 0;
        InputUtils.clearTerminal();
        while(x < 2){
            System.out.print("Doo");
            System.out.print("Bee");
            x += 1;
        }
        if(x == 2){
            System.out.println("Do");
        }
    }
}