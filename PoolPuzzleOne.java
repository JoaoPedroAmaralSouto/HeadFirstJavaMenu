package Use_a_cabeca_Java;

public class PoolPuzzleOne{
    public static void createPhrase(){
        int x = 0;
        InputUtils.clearTerminal();
        while(x < 4){
            System.out.print("a");
            if(x < 1){
                System.out.print(" ");
            }
            System.out.print("n");
            if(x > 1){
                System.out.print(" oyster");
                x += 2;
            }
            if(x == 1){
                System.out.print("noys");
            }
            if (x < 1) {
                System.out.print("oise");
            }
            System.out.println();
            x += 1;
        }
    }
}