package Use_a_cabeca_Java;
import java.util.Random;

public class ValidateShips{
    public String[] getFirtPosition(String[] Position, int i, int index, String[] Letters, String[] Numbers, Random rand) {
        index = rand.nextInt(Letters.length);
        Position[i] = Letters[index];
        if(index == Letters.length - 1){
            index = rand.nextInt(index + 1) + Numbers.length - 2;
        }
        else if(index == 0){
            index = rand.nextInt(index + 2);
        }
        else{
            index = rand.nextInt(index + 2) + index - 1;
        }
        Position[i] += Numbers[index];
        return Position;
    }
    public int getPositionY(int index, int indexNext, String[] Letters, Random rand) {
        if (index == Letters.length - 1) {
            indexNext = rand.nextInt(index + 1) + Letters.length - 2;
        }
        else if (index == 0) {
            indexNext = rand.nextInt(index + 2);
        }
        else {
            indexNext = rand.nextInt(index + 2) + index - 1;
        }
        return indexNext;
    }
    public int getPositionX(int indexNext, int indexNextNumber, String[] Numbers, Random rand) {
        if (indexNext == Numbers.length - 1) {
            indexNextNumber = rand.nextInt(index + 1) + Numbers.length - 2;
        }
        else if (indexNext == 0) {
            indexNextNumber = rand.nextInt(index + 2);
        }
        else {
            indexNextNumber = rand.nextInt(index + 2) + index - 1;
        }
        return indexNextNumber;
    }
}