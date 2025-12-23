package Use_a_cabeca_Java;
import java.util.Random;

public class ValidateShips{
    public String[] getFirtPosition(String[] Letters, String[] Numbers, Random rand) {
        int index = randomIndex(Letters.length, rand);
        int indexNumber = setNumberPosition(Numbers.length, index, rand);

        return buildPosition(index, indexNumber);
    }

    private String buildPosition(String letter, String number){
        return letter + number;
    }

    private int randomIndex(int limit, Random rand) {
        return rand.nextInt(limit)
    }

    private static int setNumberPosition(int limit, int index, Random rand) {
        if(index == Letters.length - 1){
            index = rand.nextInt(index + 1) + limit - 2;
        }
        else if(index == 0){
            index = rand.nextInt(index + 2);
        }
        else{
            index = rand.nextInt(index + 2) + index - 1;
        }
        return index;
    }

    public int getPositionY(int index, int limit, Random rand) {
        if (index == Letters.length - 1) {
            index = rand.nextInt(index + 1) + limmit - 2;
        }
        else if (index == 0) {
            index = rand.nextInt(index + 2);
        }
        else {
            index = rand.nextInt(index + 2) + index - 1;
        }
        return index;
    }

    public int getPositionX(int indexNext, int limit, Random rand) {
        if (indexNext == Numbers.length - 1) {
            indexNext = rand.nextInt(index + 1) + limit - 2;
        }
        else if (indexNext == 0) {
            indexNext = rand.nextInt(index + 2);
        }
        else {
            indexNext = rand.nextInt(index + 2) + index - 1;
        }
        return indexNext;
    }
}