package Use_a_cabeca_Java;
import java.util.Random;

public class Ships{
    protected String[] Position = new String[3];
    protected Random rand = new Random();
    protected int index = 0;
    protected int indexNext = 0;
    protected int indexNextNumber = 0;
    protected final String [] Letters = {"A", "B", "C", "D", "E", "F", "G"};
    protected final String [] Numbers = {"0", "1", "2", "3", "4", "5", "6"};
    protected void setPositionOfShips(){
        int i = 0;
        int flag = 0;
        int j = 0;
        int flag2 = -2;
        while(i < 3) {
            Position[i] = null;
            i++;
        }
        i = 0;
        while(i < 3){
            if(i == 0){
                Position[i] = getFirtPosition();
            }
            else{
                index = getIndex(Position[i - 1], Letters);
                indexNext = setPosition(Letters.length);
                indexNextNumber = setPosition(Numbers.length);
                j = 0;
                while(j < i){
                    flag = 1;
                    if(Position[1] != null){
                       flag2 = verifyDirection();
                    }
                    if(flag2 == -1){
                        if(Letters[indexNext].equals(Position[j].substring(0,1)) && Numbers[indexNextNumber].equals(Position[j].substring(1,2))){
                            while(flag == 1){
                                indexNextNumber = setPosition(Numbers.length);
                                if(!Numbers[indexNextNumber].equals(Position[j].substring(1,2)))
                                    flag = 0;
                            }
                        }
                        else if(!Letters[indexNext].equals(Position[j].substring(0,1)) && !Numbers[indexNextNumber].equals(Position[j].substring(1,2))){
                            while(flag == 1){
                                indexNextNumber = setPosition(Numbers.length);
                                if(Numbers[indexNextNumber].equals(Position[j].substring(1,2)))
                                    flag = 0;
                            }
                        }
                    }
                    else if(flag2 == 1){
                        if(Letters[indexNext].equals(Position[j].substring(0,1)) && Numbers[indexNextNumber].equals(Position[j].substring(1,2))){
                            while(flag == 1){
                                indexNext = setPosition(Letters.length);
                                if(!Letters[indexNext].equals(Position[j].substring(1,2)))
                                    flag = 0;
                            }
                        }
                        else if(!Letters[indexNext].equals(Position[j].substring(0,1)) && !Numbers[indexNextNumber].equals(Position[j].substring(1,2))){
                            while(flag == 1){
                                indexNextNumber = setPosition(Numbers.length);
                                if(Numbers[indexNextNumber].equals(Position[j].substring(1,2)))
                                    flag = 0;
                            }
                        }
                        else if(Letters[indexNext].equals(Position[j].substring(0,1)) && !Numbers[indexNextNumber].equals(Position[j].substring(1,2))){
                            while(flag == 1){
                                indexNext = setPosition(Letters.length);
                                if(!Letters[indexNext].equals(Position[j].substring(1,2)))
                                    flag = 0;
                            }
                        }
                    }
                    else if(flag2 == 0){
                        if(Letters[indexNext].equals(Position[j].substring(0,1)) && Numbers[indexNextNumber].equals(Position[j].substring(1,2))){
                            while(flag == 1){
                                indexNextNumber = setPosition(Numbers.length);
                                if(!Numbers[indexNextNumber].equals(Position[j].substring(1,2)))
                                    flag = 0;
                            }
                        }
                        else if(!Letters[indexNext].equals(Position[j].substring(0,1)) && !Numbers[indexNextNumber].equals(Position[j].substring(1,2))){
                            while(flag == 1){
                                indexNext = setPosition(Letters.length);
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

    protected int verifyDirection(){
        if(Position[0].substring(0,1).equals(Position[1].substring(0,1)) &&  !Position[0].substring(1,2).equals(Position[1].substring(1,2))){
            return 0;//Horizontal
        }
        else if(!Position[0].substring(0,1).equals(Position[1].substring(0,1)) &&  Position[0].substring(1,2).equals(Position[1].substring(1,2))){
            return 1;//Vertical
        }
        return -1;
    }

    protected String[] getPositions(){
        return Position;
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
            aux = rand.nextInt(limit - 2, index2 + 1);
        }
        else if(index2 == 0){
            aux = rand.nextInt(index2 + 2);
        }
        else{
            aux = rand.nextInt(index2 - 1, index2 + 2);
        }
        return aux;
    }
    public int setPosition(int limit){
        int aux = 0;
        if (index == limit - 1) {
            aux = rand.nextInt(limit - 2, index + 1);
        }
        else if (index == 0) {
            aux = rand.nextInt(index + 2);
        }
        else {
            aux = rand.nextInt(index - 1, index + 2);
        }
        return aux;
    }
    public int getIndex(String position, String [] library){
        int j = 0;
        if(library[0].equals("A")){
            while(j < library.length){
                if(library[j].equals(position.substring(0,1))){
                    return j;
                }
                j++;
            }
        }
        else{
            while(j < library.length){
                if(library[j].equals(position.substring(1,2))){
                    return j;
                }
                j++;
            }
        }
        return -1;
    }
}