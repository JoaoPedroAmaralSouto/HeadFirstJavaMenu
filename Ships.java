package Use_a_cabeca_Java;
import java.util.Random;

public class Ships{
    protected String[] Position = new String[3];
    protected Random rand = new Random();
    protected GetIndex getIndex = new GetIndex();
    protected int index = 0;
    protected int indexNext = 0;
    protected int indexNextNumber = 0;
    protected final String [] Letters = {"A", "B", "C", "D", "E", "F", "G"};
    protected final String [] Numbers = {"0", "1", "2", "3", "4", "5", "6"};
    protected void setPosition(){
        int i = 0;
        int flag = 0;
        int j = 0;
        ValidateShips validation = new ValidateShips();
        while(i < 3){
            if(i == 0){
                Position[i] = getFirtPosition();
            }
            else{
                index = getIndex.index(Position[i - 1], Letters);
                indexNext = getPositionY();
                indexNextNumber = getPositionX();
                j = 0;
                while(j < i){
                    flag = 1;
                    if(Letters[indexNext].equals(Position[j].substring(0,1)) && Numbers[indexNextNumber].equals(Position[j].substring(1,2))){
                        while(flag == 1){
                            indexNextNumber = getPositionX();
                            if(!Numbers[indexNextNumber].equals(Position[j].substring(1,2)))
                                flag = 0;
                        }
                        else if(!Letters[indexNext].equals(Position[j].substring(0,1)) && !Numbers[indexNextNumber].equals(Position[j].substring(1,2))){
                            while(flag == 1){
                                indexNextNumber = getPositionX();
                                if(Numbers[indexNextNumber].equals(Position[j].substring(1,2)))
                                    flag = 0;
                            }
                        }
                    }
                    j++;
                }
                Position[i] = Letters[indexNext];
                Position[i] += Numbers[indexNextNumber];
            }
            i++;
        }
    }

    public String getFirtPosition() {
        int index2 = randomIndex(Letters.length, rand);
        int indexNumber2 = setNumberPosition(Numbers.length, index2, rand);

        return buildPosition(Letters[index2], Numbers[indexNumber2]);
    }

    private String buildPosition(String letter, String number){
        return letter + number;
    }

    private int randomIndex(int limit, Random rand) {
        return rand.nextInt(limit);
    }

    private int setNumberPosition(int limit, int index2, Random rand) {
        int aux = 0;
        if(index2 == limit - 1){
            aux = rand.nextInt(index2 + 1) + limit - 2;
        }
        else if(index2 == 0){
            aux = rand.nextInt(index2 + 2);
        }
        else{
            aux = rand.nextInt(index2 + 2) + index2 - 1;
        }
        return aux;
    }

    public int getPositionY() {
        int aux = 0;
        if (index == Letters.length - 1) {
            aux = rand.nextInt(index + 1) + Letters.length - 2;
        }
        else if (index == 0) {
            aux = rand.nextInt(index + 2);
        }
        else {
            aux = rand.nextInt(index + 2) + index - 1;
        }
        return aux;
    }

    public int getPositionX() {
        int aux = 0;
        if (indexNext == Numbers.length - 1) {
            aux = rand.nextInt(index + 1) + Numbers.length - 2;
        }
        else if (indexNext == 0) {
            aux = rand.nextInt(index + 2);
        }
        else {
            aux = rand.nextInt(index + 2) + index - 1;
        }
        return aux;
    }
}