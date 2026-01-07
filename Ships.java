package Use_a_cabeca_Java;
import java.util.Random;

public class Ships{
    private final String[] Position = new String[3];
    private final Random rand = new Random();
    private int index = 0;
    private final String [] Letters = {"A", "B", "C", "D", "E", "F", "G"};
    private final String [] Numbers = {"0", "1", "2", "3", "4", "5", "6"};
    private final int rows = Letters.length;
    private final int columns = Numbers.length;
    protected void setPositionOfShips(){
        int i = 0;
        int flag;
        int j;
        int flag2 = -2;
        int indexNext;
        int indexNextNumber;
        while(i < 3) {
            Position[i] = null;
            i++;
        }
        i = 0;
        while(i < 3){
            if(i == 0){
                Position[i] = getFirstPosition();
            }
            else{
                index = getIndex(Position[i - 1], Letters);
                indexNext = setPosition(rows);
                indexNextNumber = setNumberPosition(columns, indexNext);
                j = 0;
                Position[i] = Letters[indexNext];
                Position[i] += Numbers[indexNextNumber];
                while(j < i){
                    flag = 1;
                    if(Position[1] != null){
                       flag2 = verifyDirection();
                    }
                    if (i == 1){
                        if(Letters[indexNext].equals(Position[j].substring(0,1)) && Numbers[indexNextNumber].equals(Position[j].substring(1,2))){
                            while(flag == 1){
                                indexNextNumber = setNumberPosition(columns, indexNext);
                                if(!Numbers[indexNextNumber].equals(Position[j].substring(1,2)))
                                    flag = 0;
                            }
                        }
                        else if(!Letters[indexNext].equals(Position[j].substring(0,1)) && !Numbers[indexNextNumber].equals(Position[j].substring(1,2))){
                            while(flag == 1){
                                indexNextNumber = getIndex(Position[j], Numbers);
                                if(Numbers[indexNextNumber].equals(Position[j].substring(1,2)))
                                    flag = 0;
                            }
                        }
                        j++;
                    }
                    else{
                        if(Position[i].equals(Position[j])){
                            j = 0;
                            indexNext = setPosition(rows);
                            indexNextNumber = setNumberPosition(columns, indexNext);
                        }
                        else{
                            if(flag2 == 1){
                            /*if(Letters[indexNext].equals(Position[j].substring(0,1)) && Numbers[indexNextNumber].equals(Position[j].substring(1,2))){
                                while(flag == 1){
                                    indexNext = setPosition(Letters.length);
                                    if(!Letters[indexNext].equals(Position[j].substring(0,1)))
                                        flag = 0;
                                }
                            }
                            else*/ if(!Letters[indexNext].equals(Position[j].substring(0,1)) && !Numbers[indexNextNumber].equals(Position[j].substring(1,2))){
                                    while(flag == 1){
                                        indexNextNumber = getIndex(Position[j], Numbers);
                                        j = 0;
                                        if(Numbers[indexNextNumber].equals(Position[j].substring(1,2)))
                                            flag = 0;
                                    }
                                }
                                else if(Letters[indexNext].equals(Position[j].substring(0,1)) && !Numbers[indexNextNumber].equals(Position[j].substring(1,2))){
                                    while(flag == 1){
                                        indexNext = setPosition(rows);
                                        indexNextNumber = getIndex(Position[j], Numbers);
                                        j = 0;
                                        if(!Letters[indexNext].equals(Position[j].substring(0,1)) && Numbers[indexNextNumber].equals(Position[j].substring(1,2)))
                                            flag = 0;
                                    }
                                }
                                else{
                                    j++;
                                }
                            }
                            else if(flag2 == 0){
                            /*if(Letters[indexNext].equals(Position[j].substring(0,1)) && Numbers[indexNextNumber].equals(Position[j].substring(1,2))){
                                while(flag == 1){
                                    indexNextNumber = setNumberPosition(Numbers.length, indexNext);
                                    if(!Numbers[indexNextNumber].equals(Position[j].substring(1,2)))
                                        flag = 0;
                                }
                            }
                            else */ if(!Letters[indexNext].equals(Position[j].substring(0,1)) && !Numbers[indexNextNumber].equals(Position[j].substring(1,2))){
                                    while(flag == 1){
                                        indexNext = getIndex(Position[j], Letters);
                                        j = 0;
                                        if(Letters[indexNext].equals(Position[j].substring(0,1)))
                                            flag = 0;
                                    }
                                }
                                else if(!Letters[indexNext].equals(Position[j].substring(0,1)) && Numbers[indexNextNumber].equals(Position[j].substring(1,2))){
                                    while(flag == 1){
                                        indexNext = getIndex(Position[j], Letters);
                                        indexNextNumber = setNumberPosition(columns, indexNext);
                                        j = 0;
                                        if(Letters[indexNext].equals(Position[j].substring(0,1)) && !Numbers[indexNextNumber].equals(Position[j].substring(1,2)))
                                            flag = 0;
                                    }
                                }
                                else{
                                    j++;
                                }
                            }
                        }
                    }
                    Position[i] = Letters[indexNext];
                    Position[i] += Numbers[indexNextNumber];
                }
            }
            i++;
        }
    }

    private void orderPositionOfShips(){
        int i, j;
        i = 0;
        for(String position : Position){
            j = 0;
            for (String position2 : Position){
                if(!position.equals(position2)){
                    if(position2.substring(0,1).equals(position.substring(0,1)) && !position2.substring(1,2).equals(position.substring(1,2))){
                        if(Integer.parseInt(position2.substring(1,2)) == 0){

                        }
                    }
                }
            }
        }
    }

    private boolean verifyExtremities(String currentPosition, String position){
        if(Integer.parseInt(currentPosition.substring(1,2)) == Integer.parseInt(position.substring(1,2))){

        }
        return false;
    }

    private int verifyDirection(){
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

    private String getFirstPosition() {
        int index2 = randomIndex(rows, rand);
        int indexNumber2 = setNumberPosition(columns, index2);

        return buildPosition(Letters[index2], Numbers[indexNumber2]);
    }

    private String buildPosition(String letter, String number){
        return letter + number;
    }

    private int randomIndex(int limit, Random rand) {
        return rand.nextInt(limit);
    }

    private int setNumberPosition(int limit, int index2) {
        int aux;
        if (index2 == limit - 1) {
            aux = rand.nextInt(limit - 3, index2 -1);
        }
        else if (index2 == 0) {
            aux = rand.nextInt(index2 + 3);
        }
        else {
            aux = rand.nextInt(index2 - 1, index2 + 2);
        }
        return aux;
    }

    private int setPosition(int limit){
        int aux;
        if (index == limit - 1) {
            aux = rand.nextInt(limit - 3, index -1);
        }
        else if (index == 0) {
            aux = rand.nextInt(index + 3);
        }
        else {
            aux = rand.nextInt(index - 1, index + 2);
        }
        return aux;
    }
    private int getIndex(String position, String [] library){
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