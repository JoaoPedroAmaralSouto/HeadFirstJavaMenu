package Use_a_cabeca_Java;

public class TestArrays{
    public static void test(){
        int y = 0;
        String[] islands = new String[4];
        int[] index = new int[4];
        int ref;
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;
        islands[0] = "Bermuda";
        islands[1] = "Fiji";
        islands[2] = "Azores";
        islands[3] = "Cozumel";
        while(y < 4){
            ref = index[y];
            System.out.print("island = ");
            System.out.println(islands[ref]);
            y += 1;
        }
    }
}