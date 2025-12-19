package Use_a_cabeca_Java;

public class Puzzle4 {
    public static void startPuzzle4(){
        Value[] values = new Value[6];
        int number = 1;
        int i = 0;
        while (i < 6){
            values[i] = new Value();
            values[i].intValue = number;
            number = number * 10;
            i += 1;
        }
        int result = 0;
        i = 6;
        while(i > 0){
            i -= 1;
            result += values[i].doStuff(i);
        }
        System.out.println("result " + result);
    }
}