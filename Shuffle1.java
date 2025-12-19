package Use_a_cabeca_Java;

public class Shuffle1{
    public static void createPhrase(){
        int x = 3;
        InputUtils.clearTerminal();
        while (x > 0){
            if(x > 2){
                System.out.print("a");
            }
            x -= 1;
            System.out.print("-");
            if(x == 2){
                System.out.print("b c");
            }
            if(x == 1){
                System.out.println("d");
                x -= 1;
            }
        }
    }
}