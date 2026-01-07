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
                if(Position[1] != null){
                    flag2 = verifyDirection();
                    orderPositionOfShips();
                }
                index = getIndex(Position[i - 1], Letters);
                indexNext = setRow(rows);
                indexNextNumber = setColumn(columns, indexNext);
                j = 0;
                Position[i] = Letters[indexNext];
                Position[i] += Numbers[indexNextNumber];
                boolean verify = verifyExtremities(Position[i], Position[i - 1]);
                /*if(!verify){
                    --i;
                }*/
                while(j < i){
                    flag = 1;
                    if (i == 1){
                        if(Letters[indexNext].equals(Position[j].substring(0,1)) && Numbers[indexNextNumber].equals(Position[j].substring(1,2))){
                            while(flag == 1){
                                indexNextNumber = setColumn(columns, indexNext);
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
                            indexNext = setRow(rows);
                            indexNextNumber = setColumn(columns, indexNext);
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
                                        indexNext = setRow(rows);
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
                                    indexNextNumber = setColumn(Numbers.length, indexNext);
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
                                        indexNextNumber = setColumn(columns, indexNext);
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

    private void orderPositionOfShips() {
        for (int i = 0; i < Position.length - 1; i++) {
            for (int j = i + 1; j < Position.length; j++) {
                if (Position[i] == null || Position[j] == null) continue;
                int row1 = getIndex(Position[i], Letters);
                int col1 = getIndex(Position[i], Numbers);
                int row2 = getIndex(Position[j], Letters);
                int col2 = getIndex(Position[j], Numbers);
                if (row1 > row2 || (row1 == row2 && col1 > col2)) {
                    String aux = Position[i];
                    Position[i] = Position[j];
                    Position[j] = aux;
                }
            }
        }
    }


    private boolean verifyExtremities(String currentPosition, String position){
        int row1 = getIndex(currentPosition, Letters);
        int col1 = getIndex(currentPosition, Numbers);
        int row2 = getIndex(position, Letters);
        int col2 = getIndex(position, Numbers);
        if(!currentPosition.equals(position)){
            if((row2 == rows - 1 || row2 == rows - 2) && row1 == row2){
                if(col2 == columns -1 || col2 == columns - 2){
                    return col1 == col2 - 1;
                }
                else if (col2 == 0 || col2 == 1){
                    return col1 == col2 + 1;
                }
            }
            else if((row2 == 0 || row2 == 1) && row1 == row2){
                if(col1 == columns -1 || col1 == columns - 2){
                    return col1 == col2 - 1;
                }
                else if (col2 == 0 || col2 == 1){
                    return col1 == col2 + 1;
                }
            }
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
        int indexNumber2 = setColumn(columns, index2);

        return buildPosition(Letters[index2], Numbers[indexNumber2]);
    }

    private String buildPosition(String letter, String number){
        return letter + number;
    }

    private int randomIndex(int limit, Random rand) {
        return rand.nextInt(limit);
    }

    private int setColumn(int limit, int index2) {
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

    private int setRow(int limit){
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