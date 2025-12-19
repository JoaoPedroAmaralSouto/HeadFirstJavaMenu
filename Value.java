package Use_a_cabeca_Java;

public class Value {
    int intValue;
    public int doStuff(int factor){
        if (intValue > 100){
            return intValue * factor;
        }
        else{
            return intValue * (5 - factor);
        }
    }
}