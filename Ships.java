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
        int indexNext;
        int indexNextNumber;
        boolean direction;
        String temporaryPosition;
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
                boolean verify;
                direction = rand.nextBoolean();
                if(direction){
                    indexNext = getIndex(Position[i - 1], Letters);
                    indexNextNumber = setColumn(columns, indexNext);
                }
                else{
                    index = getIndex(Position[i - 1], Letters);
                    indexNextNumber = getIndex(Position[i - 1], Numbers);
                    indexNext = setRow(rows);
                }
                temporaryPosition = Letters[indexNext];
                temporaryPosition += Numbers[indexNextNumber];
                verify = verifyIfTemporaryPositionExists(temporaryPosition, i);
                if(!verify){
                    Position[i] = temporaryPosition;
                    if(Position[1] != null){
                        orderPositionOfShips();
                    }
                    verify = verifyExtremities(Position[i], Position[i - 1]);
                    if(!verify){
                        --i;
                    }
                }
                else{
                    --i;
                }
            }
            i++;
        }
    }

    private boolean verifyIfTemporaryPositionExists(String position, int limit){
        for (int i = 0; i < limit; i++) {
            if (Position[i].equals(position)) {
                return true;
            }
        }
        return false;
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
                else{
                    return col1 == col2 + 1 ||  col1 == col2 - 1;
                }
            }
            else if((row2 == 0 || row2 == 1) && row1 == row2){
                if(col1 == columns -1 || col1 == columns - 2){
                    return col1 == col2 - 1;
                }
                else if (col2 == 0 || col2 == 1){
                    return col1 == col2 + 1;
                }
                else{
                    return col1 == col2 + 1 ||  col1 == col2 - 1;
                }
            }
            else if ((row2 != rows - 1 && row2 != rows - 2) && row1 == row2){
                if(col1 == columns -1 || col1 == columns - 2){
                    return col1 == col2 - 1;
                }
                else if (col2 == 0 || col2 == 1){
                    return col1 == col2 + 1;
                }
                else{
                    return col1 == col2 + 1 ||  col1 == col2 - 1;
                }
            }
            else if((row2 != 0 && row2 != 1) && row1 == row2){
                if(col1 == columns -1 || col1 == columns - 2){
                    return col1 == col2 - 1;
                }
                else if (col2 == 0 || col2 == 1){
                    return col1 == col2 + 1;
                }
                else{
                    return col1 == col2 + 1 ||  col1 == col2 - 1;
                }
            }
            else if((col2 == columns - 1 || col2 == columns - 2) && col1 == col2){
                if(row2 == rows -1 || row2 == rows - 2){
                    return row1 == row2 - 1;
                }
                else if (row2 == 0 || row2 == 1){
                    return row1 == row2 + 1;
                }
                else{
                    return row1 == row2 + 1 ||  row1 == row2 - 1;
                }
            }
            else if((col2 == 0 || col2 == 1) && col1 == col2){
                if(row2 == rows -1 || row2 == rows - 2){
                    return row1 == row2 - 1;
                }
                else if (row2 == 0 || row2 == 1){
                    return row1 == row2 + 1;
                }
                else{
                    return row1 == row2 + 1 ||  row1 == row2 - 1;
                }
            }
            else if((col2 != columns - 1 && col2 != columns - 2) && col1 == col2){
                if(row2 == rows -1 || row2 == rows - 2) {
                    return row1 == row2 - 1;
                }
                else if (row2 == 0 || row2 == 1){
                    return row1 == row2 + 1;
                }
                else{
                    return row1 == row2 + 1 ||  row1 == row2 - 1;
                }
            }
            else if((col2 != 0 && col2 != 1) && col1 == col2){
                if(row2 == rows -1 || row2 == rows - 2){
                    return row1 == row2 - 1;
                }
                else if (row2 == 0 || row2 == 1){
                    return row1 == row2 + 1;
                }
                else{
                    return row1 == row2 + 1 ||  row1 == row2 - 1;
                }
            }
        }
        return false;
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